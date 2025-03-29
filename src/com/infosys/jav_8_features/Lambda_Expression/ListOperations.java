package com.infosys.jav_8_features.Lambda_Expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {

		// List<Integer> list= new ArrayList<Integer>();

		List<Integer> list = Arrays.asList(12, 13, 14, 14, 34, 56);

		list.forEach(a -> System.out.println(a));

		System.out.println(".....................................");

		Collections.sort(list);

		list.forEach(System.out::println);
		
		 

	}

}
