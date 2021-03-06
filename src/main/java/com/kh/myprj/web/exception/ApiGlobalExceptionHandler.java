package com.kh.myprj.web.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kh.myprj.web.api.JsonResult;

// 모든 컨트롤러의 예외처리에 대응한다.
@RestControllerAdvice //@ControllerAdvice + @ResponseBody
public class ApiGlobalExceptionHandler {
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public JsonResult<String> emptyExHeldler(EmptyResultDataAccessException ex){
		return new JsonResult<String>("01","nok","일치하는 회원정보가 없습니다.");
	
	}
}
