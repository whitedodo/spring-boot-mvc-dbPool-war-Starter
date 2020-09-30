/*	
 * 	주제(Subject): Spring Boot - MVC Demo
 * 	(Oracle 19g, MySQL 8.0.21, MyBatis Starter 2.4, HikariCP 3.4)  
 * 	생성일자(Create Date): 2020-09-30
 * 	저자(Author): Dodo (rabbit.white at daum dot net)
 *  파일명(Filename): CompUser.java
 *  설명(Description)
 *  1. TBL - CompUser.sql 위치: Docs 폴더에 위치함. , Dodo, 2020-09-30
 *  2. Spring Security에 적용할 수 있는 구조로 설계됨. , Dodo, 2020-09-30
 */


package com.springmvc.home.model;

public class CompUser {
	
	private String username;
	private String password;
	private int enabled;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
}
