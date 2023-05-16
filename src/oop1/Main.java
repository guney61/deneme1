package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Ora";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05556556565");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setLastName("Demiroğ");
		individualCustomer.setFirstName("Engin");
		
		
		CorperedCostumer corperedCostumer = new CorperedCostumer();
		corperedCostumer.setId(2);
		corperedCostumer.setCompanyName("Dolama.io");
		corperedCostumer.setPhone("05333333333");
		corperedCostumer.setTaxNumber("11111111111");
		corperedCostumer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corperedCostumer};

	}

}
