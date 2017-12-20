import { Injectable } from '@angular/core';
import { AppConfig } from '../app/app.config';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { AutoCompleteService } from "ionic2-auto-complete";

@Injectable()
export class RulesAutoCompleteService implements AutoCompleteService {

  labelAttribute = "receiver";

  constructor(private http: Http) {
  }

  getResults(keyword: string) {
    return this.http.get(AppConfig.api_url + "/analytics/rules/search?query=" + keyword)
      .map((res: Response) => {
        return res.json()._embedded != null ? res.json()._embedded.customRuleEntityList : [];
      })
      .catch(this.handleError);
  }

  handleError(error) {
    console.error(error);
    let errorJson = error.json();
    if (errorJson) {
      return Observable.throw(errorJson || 'Server error');
    } else {
      return Observable.throw(error || 'Server error');
    }
  }

}
