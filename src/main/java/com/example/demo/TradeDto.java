package com.example.demo;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TradeDto {
	private String trade_id;
	private List<Map<String,Integer>> trade;
	private int sum;
	
	public static TradeDto createWithVo(TradeVo tradeVo) {
		List<Map<String,Integer>> trade = tradeVo.getTrade();
		int sum = createSum(trade);
		return new TradeDto(tradeVo.getTrade_id(), trade, sum);
	}

	private static int createSum(List<Map<String,Integer>> trade) {
		
		return trade.stream().mapToInt(x->x.get("payment")).sum();
	}	
}
