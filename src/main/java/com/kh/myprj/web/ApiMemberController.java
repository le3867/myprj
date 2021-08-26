package com.kh.myprj.web;

import javax.validation.Valid;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.myprj.domain.member.svc.MemberSVC;
import com.kh.myprj.web.api.FindEmailReq;
import com.kh.myprj.web.api.FindPwReq;
import com.kh.myprj.web.api.JsonResult;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController //@Controller + @ResponseBody
@RequestMapping("/api/members")
@AllArgsConstructor
public class ApiMemberController {

	private final MemberSVC memberSVC;
	
	
	//이메일찾기
	@GetMapping("/email")
	public JsonResult<String> findEmail(
			@RequestBody FindEmailReq findEmailReq,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return  null ;
		}
		
		JsonResult<String> result = null;
		
	String findedEmail =
			memberSVC.findEmail(findEmailReq.getTel(), findEmailReq.getBirth());
			
		return new JsonResult<>("00","ok",findedEmail) ;
	}
	
	//비밀번호찾기
	@GetMapping("/Pw")
	public Object findPw(
			@RequestBody FindPwReq findPwReq,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return null ;
		}
		

		
	String findedPw =
			memberSVC.findPw(findPwReq.getEmail(),findPwReq.getTel(), findPwReq.getBirth());
		
		return new JsonResult<>("00","ok",findedPw) ;
	}
}
