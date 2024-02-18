package practice.collections;

public class Stock implements Comparable<Stock>{
	
	private String stockname;
	
	private Double lastTradingPrice;
	
	
	public Stock() {
		
	}

	public Stock(String stockname, Double lastTradingPrice) {
		super();
		this.stockname = stockname;
		this.lastTradingPrice = lastTradingPrice;
	}


	public String getStockname() {
		return stockname;
	}


	public void setStockname(String stockname) {
		this.stockname = stockname;
	}


	public Double getLastTradingPrice() {
		return lastTradingPrice;
	}


	public void setLastTradingPrice(Double lastTradingPrice) {
		this.lastTradingPrice = lastTradingPrice;
	}

	@Override
	public int compareTo(Stock o) {
		
	//	return this.stockname.compareTo(o.getStockname());
		
		return this.lastTradingPrice.compareTo(o.getLastTradingPrice());
	}

	@Override
	public String toString() {
		return "Stock [stockname=" + stockname + ", lastTradingPrice=" + lastTradingPrice + "]";
	}

	
}
