package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello Spring boot";
	}
	
	@GetMapping("/userinfo")
	public HashMap<String, Object> getUserInfo(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Tom");
		map.put("age", 23);
		map.put("phone", "010-0000-0001");
		
		return map;
	}
	
	@GetMapping("/person")
	public List<HashMap<String, Object>> getPerson(){
		List<HashMap<String,Object>> li = new ArrayList<>();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("age", 23);
		map.put("phone", "010-0000-0001");		
		li.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "임꺽정");
		map.put("age", 24);
		map.put("phone", "010-0000-0002");		
		li.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "장길산");
		map.put("age", 26);
		map.put("phone", "010-0000-0003");		
		li.add(map);
		
		return li;
	}
	
	@GetMapping("/person2")
	public List<PersonDto> getPerson2(){
		List<PersonDto> list = new ArrayList<>();
		list.add(new PersonDto(1, "홍길동", "010-0000-0001", "hong@aa.com"));
		list.add(new PersonDto(2, "홍길동2", "010-0000-0002", "hong@aa22.com"));
		
		return list;
	}
}
