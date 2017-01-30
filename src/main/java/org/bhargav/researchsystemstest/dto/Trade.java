package org.bhargav.researchsystemstest.dto;

public class Trade {

	private long transactionId;
	private String symbol;
	private String action;
	private Long quantity;
	private Double price;
	private Double marketValue;

	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	
	@Override
	public String toString() {
		return "Trade [transactionId=" + transactionId + ", symbol=" + symbol
				+ ", action=" + action + ", quantity=" + quantity + ", price="
				+ price + ", marketValue=" + marketValue + "]";
	}
}
