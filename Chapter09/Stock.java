
public class Stock{

	String symbol,name;
	double previousClosingPrice,currentPrice;

	public Stock(String symbol, String name){
		this.symbol=symbol;
		this.name=name;
	}

	public void setCurrent(double currentPrice){
		this.currentPrice=currentPrice;
		
	}


	public void setPreviousClosingPrice(double previousClosingPrice){
		this.previousClosingPrice=previousClosingPrice;
	}


	double getChangePercent(){

		return (1-currentPrice/previousClosingPrice)*100;
	}


	public static void main(String[] arge){

		Stock ORCL = new Stock("ORCL","Oracle Corporation");
		ORCL.setCurrent(34.35);
		ORCL.setPreviousClosingPrice(34.5);

		System.out.printf("The price of %s changed %3.1f%% %n",ORCL.name, ORCL.getChangePercent());

	}

}