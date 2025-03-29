package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class filterdemos1 {

	public static void main(String[] args) {


		List<Integer> number = Arrays.asList(10,20,30,40,50,60,70,90,80);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		//Withou using streams
		
//		for (Integer n : number) {
//			
//			if(n%2==0)
//				evenNumbersList.add(n);
//		}
//		System.out.println(evenNumbersList);
//		
		//Using Strams
		//evenNumbersList=number.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evenNumbersList);
		
		//number.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		number.stream().filter(n->n%2==0).forEach(System.out::println);


		
		
		
		
	}

}
