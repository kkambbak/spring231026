package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// DTO - Data transfer object
//테이블에 데이터를 넣거나 가져오거나 한다. 보통 하나의 테이블당 하나의 DTO를 만든다.
//Join의 경우 Join이 되는 항목을 다 가져와야한다. 그래서 여러개의 테이블로부터 DTO가 만들어질수있다.(readOnly용으로 씀-VO)

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonDto {
	private int id;
	private String name;
	private String phone;
	private String email;
}


