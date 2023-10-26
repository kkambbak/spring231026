package com.example.demo;

import java.util.List;
import java.util.Map;

import lombok.Getter;

@Getter
public class TradeVo {
	private String trade_id;
	private List<Map<String,Integer>> trade;
}
