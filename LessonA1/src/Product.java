/**
 * 
 * @author Michelle Li
 * Period 1	
 *
 */

public class Product {
	
	static String companyName;
	String name;
	double cost, unitPrice, discount, unitSalePrice;
	int quantitySold;
	
	public Product() {
		name = "";
		cost = 0;
		unitPrice = 0; 
		discount = 0;
		unitSalePrice = 0;
		quantitySold = 0;
		this.unitSalePrice = calculateSalePrice();
	}
	
	public Product(String name, double cost, double price, double discount, int quantity) {
		this.name = name;
		this.cost = cost;
		this.unitPrice = price;
		this.discount = discount;
		this.quantitySold = quantity;
		this.unitSalePrice = calculateSalePrice();
		
	}
	
	public Product(String name, double cost, double price, int quantity) {
		this.discount = 0;
		this.name = name;
		this.cost = cost;
		this.unitPrice = price;
		this.quantitySold = quantity;
		this.unitSalePrice = calculateSalePrice();
	}
	
	private double calculateSalePrice() {
		this.unitSalePrice = this.unitPrice * (100 - this.discount) / 100.0;
		return this.unitSalePrice;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setPrice(double price) {
		this.unitPrice = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
		this.unitSalePrice = this.unitPrice * (100-discount) / 100;
	}
	
	public void setCompany(String company) {
		this.companyName = company;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public double getPrice() {
		return this.unitPrice;
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	public double getSalePrice() {
		return this.unitSalePrice;
	}
	
	public int getQuantitySold() {
		return this.quantitySold;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	private double unitProfit() {
		return this.unitSalePrice - this.cost;
	}
	
	public double totalProfit() {
		return this.quantitySold * (this.unitSalePrice - this.cost);
	}
	
	public String toString() {
		String s;
		s = companyName + "\n";
		s += "------------------------------------------------------\n";
		s += String.format("%s: \nCost           = $%8.2f\n", name, getCost());
		s += String.format("Price          = $%8.2f\n", getPrice());
		s += String.format("Discount       = %8.2f%s", getDiscount(), "%\n");
		s += String.format("Sale Price     = $%8.2f\n", getSalePrice());
		s += String.format("Quantity Sold  = $%8d\n", getQuantitySold());
		s += String.format("Profit/unit    = $%8.2f\n", unitProfit());
		s += String.format("Total Profit   = $%8.2f\n", totalProfit());
		return s;
	}

	public void setQuantitySold(int quantity) {
		this.quantitySold = quantity;
		
	}
}
