/*	
 * 	주제(Subject): Spring Boot - MVC Demo
 * 	(Oracle 19g, MySQL 8.0.21, MyBatis Starter 2.4, HikariCP 3.4)  
 * 	생성일자(Create Date): 2020-09-30
 * 	저자(Author): Dodo (rabbit.white at daum dot net)
 *  파일명(Filename): SpringBootMvcDemoApplication.java
 *  설명(Description)
 *  1. War, Jar 배포 동시에 가능한 형태로 코드 수정함.
 * 
 */

package com.springmvc.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootMvcDemoApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootMvcDemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringBootMvcDemoApplication.class);
		app.run(args);
		
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(SpringBootMvcDemoApplication.class);
	}

}
