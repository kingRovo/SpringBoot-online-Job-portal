package com.rovo.mypath_alerts.Security;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.GET,"/").permitAll()
                .antMatchers(HttpMethod.GET, "/findJob/*").permitAll()
                .antMatchers(HttpMethod.POST,"/job").permitAll()
                .antMatchers(HttpMethod.PUT,"/edit_job/*").permitAll()
                .antMatchers(HttpMethod.DELETE,"/").permitAll()
                .anyRequest().authenticated();
    }
}