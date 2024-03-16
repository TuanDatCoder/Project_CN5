package com.FTimeshare.UsageManagement.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class AppConfig {
        @Bean
        public FilterRegistrationBean<CharacterEncodingFilter> characterEncodingFilter() {
            FilterRegistrationBean<CharacterEncodingFilter> registrationBean = new FilterRegistrationBean<>();
            CharacterEncodingFilter filter = new CharacterEncodingFilter();
            filter.setEncoding("UTF-8");
            filter.setForceEncoding(true);
            registrationBean.setFilter(filter);
            registrationBean.addUrlPatterns("/*");
            return registrationBean;
        }
    }

