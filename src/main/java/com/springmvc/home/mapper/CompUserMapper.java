/*	
 * 	주제(Subject): Spring Boot - MVC Demo
 * 	(Oracle 19g, MySQL 8.0.21, MyBatis Starter 2.4, HikariCP 3.4)  
 * 	생성일자(Create Date): 2020-09-30
 * 	저자(Author): Dodo (rabbit.white at daum dot net)
 *  파일명(Filename): CompUserMapper.java
 *  설명(Description)
 *  1. SELECT문 적용함
 *  2. 세부 가이드 - docs 폴더 내 Mapper-guide.txt 참고할 것
 */

package com.springmvc.home.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springmvc.home.model.CompUser;

@Mapper
public interface CompUserMapper {
	
	@Select("select * from comp_users where username = #{username}")
	public CompUser findByUsername(String username);

}
