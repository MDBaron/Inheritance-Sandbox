package products;

import java.text.NumberFormat;

public class Product {
	private String code;
	private String description;
	private double price;
	protected static int count = 0;
	
	public Product(){
		
		code = "";
		description = "";
		price = 0;
		
	}//constructor
	
	@Override
	public String toString(){
		String message = 
				"Code:		" + code + "\n" +
				"Description:	" + description + "\n" +
				"Price:		" + price + "\n";
		return message;
	}//Overriden toString
	
	private String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	public static int getCount(){
		
		return count;
		
	}//getCount
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Product.count = count;
	}

	
}
