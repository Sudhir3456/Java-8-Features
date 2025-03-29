package com.infosys.jav_8_features.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDriver {

	public static void main(String[] args) {

		Product products1 = new Product(4321, "Hp-Laptop", 34000, "sliver", 5);
		Product products2 = new Product(4322, "Nokia", 34090, "Gold", 4);
		Product products3 = new Product(4323, "ios", 34098, "white", 5);
		Product products4 = new Product(43214, "Hp", 45000, "sliver", 3);
		Product products5 = new Product(4325, "Hp-Laptop56", 34500, "balack", 4);
		Product products6 = new Product(4327, "Hp-Laptop78", 37000, "White", 4);
		Product products7 = new Product(4327, "Apple", 780000, "sliver", 5);
		Product products8 = new Product(4326, "Hp78", 780000, "Gold", 3);
		Product products9 = new Product(4328, "Hp76", 56000, "Balack", 5);
		Product products10 = new Product(4329, "Hp89", 90000, "sliver", 4);

		List<Product> products = Arrays.asList(products1, products2, products3, products4, products5, products6,
				products7, products8, products9, products10);

		System.out.println("Products Without Sorting..........................");

		products.forEach(System.out::println);

		System.out.println("Products With Sorting.By Rating.........................");

		products.sort(Comparator.comparingInt(Product::getRating));
		products.forEach(System.out::println);

		System.out.println("Products With Sorting.By Rating in Reverse Orrder.........................");

		products.sort(Comparator.comparingInt(Product::getRating).reversed());
		products.forEach(System.out::println);

		System.out.println("Products With Sorting.By Price Orrder.........................");

		// Method ref
		products.sort(Comparator.comparing(Product::getPrice));
		products.forEach(System.out::println);

		// Using Lamebda exp...
		// products.sort(a1,a2)->
//		
//		products.sort(a1,a2))-> Double.compare(a2.getPrice(),a1.getP)
//
//       products.sort(a1,a2)) -> Double.compare(a1.get, 0)
		
		//products.sort(a,b))->Double.compare(b.getp, 0)

		System.out.println("Products With Sorting.By Price which is grater then 500000.........................");

		List<Product> filtersProduct = products.stream().filter(a -> a.getPrice() >= 50000)
				.collect(Collectors.toList());

		//System.out.println(filtersProduct);
		
		products.forEach(System.out::println);
		
		
		System.out.println("Products With Filtering.By Rating which is grater then and eqal 3.........................");

		List<Product> filtersProduct1 = products.stream().filter(b -> b.getPrice()>= 50000)
				.collect(Collectors.toList());
		
		List<Product> filtersProductByRating=products.stream().filter(c->c.getRating()>=3).collect(Collectors.toList());
		
   
		//method ref
		//List<Product> filtersProductByRating3=products.stream().filter(Product::getPrice).collect(Collectors.toList());

		
	}

}
