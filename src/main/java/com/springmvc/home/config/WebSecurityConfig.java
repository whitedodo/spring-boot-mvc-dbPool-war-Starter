/*	
 * 	주제(Subject): Spring Boot - MVC Demo
 * 	(Oracle 19g, MySQL 8.0.21, MyBatis Starter 2.4, HikariCP 3.4)  
 * 	생성일자(Create Date): 2020-09-30
 * 	저자(Author): Dodo (rabbit.white at daum dot net)
 *  파일명(Filename): WebSecurityConfig.java
 *  설명(Description)
 *  1. WebSecurityConfig (Spring Security 5 환경 설정 영역)
 * 
 */

package com.springmvc.home.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/welcome").permitAll()
		.antMatchers("/page1").hasRole("ADMIN")
		.anyRequest().authenticated();
		
	}

}
