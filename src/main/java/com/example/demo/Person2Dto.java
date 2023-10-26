package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Person2Dto {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private int avg;
}
