package com.example.demo;


import java.util.HashMap;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiveController {
	
	//add?x=5&y=7
	@GetMapping("/add")
	public String add(int x, int y) {
		int result  = x + y;
		return String.format("%d +_%d = %d",x,y,result);
	}
	
	@GetMapping("/add/{x}/{y}")
	public String add2(@PathVariable("x")int x, @PathVariable("y")int y) {
		int result  = x + y;
		return String.format("%d + %d = %d",x,y,result);
	}
	
	@GetMapping("/gugu/{x}")
	public String gugu(@PathVariable("x")int x) {
		
		StringBuffer sb = new StringBuffer();
		
		IntStream.rangeClosed(1, 9)
			.mapToObj(n->String.format("%d * %d = %d<br>",x, n,x*n))
			.forEach(sb::append);
		
		return sb.toString();
	}
	
	//post방식은 html페이지에서 post전송을하거나 별도의 툴 도움을 받아야한다.
	//curl: 윈도우, 리눅스 둘 다 가능, 엄청 긴 문장으로
	
	@PostMapping("/add_post")
	public String add_post(int x, int y) {
		return String.format("%d + %d = %d", x, y, x+y);
	}
	
	@PostMapping("/add_json") // js fetch, axios라이브러리
	public String add_json(@RequestBody HashMap<String, String> map) {
		
		int x = Integer.parseInt(map.get("x"));
		int y = Integer.parseInt(map.get("y"));

		return String.format("%d + %d = %d", x, y, x+y);
		
	}
	
	//문제1
	@PostMapping("/score_json")
	public Person2Dto score_json(@RequestBody Person2Vo person) {
		String name = person.getName();
		int kor = person.getKor();
		int eng = person.getEng();
		int mat = person.getMat();
		int total = kor+eng+mat;
		int avg = total/3;
		
		return new Person2Dto(name, kor, eng, mat, total, avg);
	}
	
	//문제2
	@PostMapping("/trade_json")
	public TradeDto trade_json(@RequestBody TradeVo tradeVo) {
		
		return TradeDto.createWithVo(tradeVo);
	}
}
