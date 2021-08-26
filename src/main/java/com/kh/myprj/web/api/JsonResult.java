package com.kh.myprj.web.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data											//getter,setter,toString,equals,hashcode
@NoArgsConstructor				//디폴트 생성자
@AllArgsConstructor				//모든 멤버를 매개변수로 갖는 생성자
public class JsonResult<T> {

	private String rtcd;
	private String rtmsg;
	private T data;
}