package com.kh.myprj.domain.member.dao;

import java.sql.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.myprj.domain.member.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberDAOImplTest {

	@Autowired
	private MemberDAO mdao;
	
	@Test
	@DisplayName("가입")
	@Disabled
	void insert() {
		MemberDTO mdto = new MemberDTO();
		
//		pstmt.setString(1, memberDTO.getEmail());
//		pstmt.setString(2, memberDTO.getPw());
//		pstmt.setString(3, memberDTO.getTel());
//		pstmt.setString(4, memberDTO.getNickname());
//		pstmt.setString(5, memberDTO.getGender());
//		pstmt.setString(6, memberDTO.getRegion());
//		pstmt.setDate(7, memberDTO.getBirth());
//		pstmt.setString(8,memberDTO.getLetter());
		mdto.setEmail("test3@test.com");
		mdto.setPw("1234");
		mdto.setTel("01012345678");
		mdto.setNickname("테스터2");
		mdto.setGender("남");
		mdto.setRegion("울산");
		mdto.setBirth(Date.valueOf("2021-08-20"));
		mdto.setLetter("1");
		
		log.info("member_id:{}",mdao.insert(mdto));
	}
	@Test
	@DisplayName("조회")
	void findById() {
		
	log.info("findById:{}",mdao.findById(5));
	
	}
	@Test
	@DisplayName("조회")
	void findByEmail() {
		
		log.info("findByEmail:{}",mdao.findByEmail("test3@test.com"));
		
	}
}




































