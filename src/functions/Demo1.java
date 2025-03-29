package functions;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {

       Function<Integer,Integer> f=n->n*n;
       
       System.out.println(f.apply(5));  //25
       System.out.println(f.apply(10));  //100
       System.out.println(f.apply(2));  //4
       System.out.println(f.apply(5));  //25
       System.out.println(f.apply(5));  //25
       System.out.println(f.apply(5));  //25
       System.out.println(f.apply(5));  //25
       
       //String length
      // String---> length---.int
       
       Function<String,Integer> fn=s->s.length();
       System.out.println(fn.apply("Welcome"));  //7
       System.out.println(fn.apply("java programming"));  //25
       System.out.println(fn.apply("ram"));  //25


		
		
		
		
	}

}
