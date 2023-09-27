
public class Product {
	
	//Properties
	private String name;
	private double price;
	private double totalPrice;
	private double taxPerc;
	
	
	
	public Product() {
		System.out.println("In constructor Product");
		
	}
	
	public Product(double price) {
		this.price = price;
	}
	
	public void calculateTotalPrice() {
		totalPrice = price * taxPerc;
	}
	//Method
	public void printPrice() {
		System.out.println("Prijs = " + price);
		System.out.println();
		System.out.println();
	}
	
	public void setPrice(double newPrice) {
		if (newPrice > 0 && newPrice < 10000)
			price = newPrice;
	}
	
	public Product(String name, double price, double totalPrice, double taxPerc) {
		super();
		this.name = name;
		this.price = price;
		this.totalPrice = totalPrice;
		this.taxPerc = taxPerc;
	}

	public boolean isExpensive() {
		return price>100;
	}
	
	public double getPrice() {
		return price;
	}

}
