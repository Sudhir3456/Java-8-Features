package filterdemos;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class filterdemos4 {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1, "HP Laptop", 25000));
		productList.add(new Product(2, "dell Laptop", 26000));
		productList.add(new Product(3, "apple Laptop", 27000));
		productList.add(new Product(4, "Lenova Laptop", 28000));
		productList.add(new Product(5, "ios Laptop", 2500000));
		productList.add(new Product(6, "sony Laptop", 29000));

		productList.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));

	}

}
