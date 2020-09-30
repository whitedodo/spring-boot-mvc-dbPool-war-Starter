/*	
 * 	주제(Subject): Spring Boot - MVC Demo
 * 	(Oracle 19g, MySQL 8.0.21, MyBatis Starter 2.4, HikariCP 3.4)  
 * 	생성일자(Create Date): 2020-09-30
 * 	저자(Author): Dodo (rabbit.white at daum dot net)
 *  파일명(Filename): RestStarterController.java
 *  설명(Description)
 *  1. REST - 서비스 적용됨. (Spring Web Service)
 *  2. 
 * 
 */

package com.springmvc.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.home.mapper.CompUserMapper;
import com.springmvc.home.model.CompUser;

@RestController
@RequestMapping("/cities")
public class RestStarterController {
	
	private final CompUserMapper compUserMapper;

	public RestStarterController(CompUserMapper compUserMapper) {
		this.compUserMapper = compUserMapper;
	}

	@GetMapping("{state}")
	CompUser getCompUser(@PathVariable String state) {
	
		CompUser user = compUserMapper.findByUsername(state);
		
		System.out.println("계정명:" + user.getUsername());
		
	  return compUserMapper.findByUsername(state);
  
	}

}