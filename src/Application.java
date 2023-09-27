
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		Product product1 = new Product(); 
		Product product2 = new Product();
		
		//Waardes toekennen
		//product1.name= "TV";
		//product1.price= 123;
		product1.printPrice();
		product1.setPrice(250);
		
		
		//product2.name= "Laptop";
		//product2.price= 850;
		product2.printPrice();
		product2.setPrice(920.5);
		
		//System.out.println("Product 2 prijs is " + product2.price);

		boolean outcome = product2.isExpensive();
		System.out.println("Product 2 is duur: " + outcome);
		
		Product product3 = new Product(34.75);
		System.out.println("Product 3 prijs = " + product3.getPrice());
		

	}

}
