package org.bhargav.researchsystemstest.dto;

import java.util.List;

public class Data {

	private List<Trade> trades;

	public List<Trade> getTrades() {
		return trades;
	}
	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}

	
	@Override
	public String toString() {
		return "Data [trades=" + trades + "]";
	}
}
