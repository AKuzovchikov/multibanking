/*
 * Copyright 2018-2018 adorsys GmbH & Co KG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.adorsys.xs2a.model;

import java.util.Objects;

public class ConsentXS2AUpdateRequest extends XS2AUpdateRequest {
    private String consentId;

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConsentXS2AUpdateRequest that = (ConsentXS2AUpdateRequest) o;
        return Objects.equals(consentId, that.consentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consentId);
    }

    @Override
    public String toString() {
        return "ConsentXS2AUpdateRequest{" +
                       "consentId='" + consentId + '\'' +
                       '}';
    }
}
