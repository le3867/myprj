package com.kh.myprj.web.api;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class FindEmailReq {

	@NotBlank
	@Size(max = 13)
	private String tel;
	@NotBlank
	@Size(max=10)
	private Date birth;
	
}
