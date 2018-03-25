/*
 * WebConfig.java erzeugt am 14.07.2017
 * <p>
 * Eigentum der TeamBank AG Nürnberg
 */
package de.adorsys.multibanking.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import de.adorsys.multibanking.service.interceptor.CacheInterceptor;

@Configuration
public class CacheInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private CacheInterceptor cacheInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(cacheInterceptor);
    }
}
