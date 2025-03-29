package predicates;

import java.util.function.Predicate;

//joining predicates--and , or , negate
//p1 ---- checks number is even
//p2 -- checks greater then 50



public class Demo3 {

	public static void main(String[] args) {

     int a[]= {5,15,20,25,30,35,40,45,50,55,55,60,65};
     
     Predicate<Integer> p1= i->i%2==0;
     Predicate<Integer> p2= i->i>50;

     //and
     //System.out.println("following are numbers EVEN & Greater then 50....");
//     
//     for (int n : a) {
//		
//    	 if(p1.and(p2).test(n)) { //if(p1.test(n) && p2.test(n))
//    		 
//    		 System.out.println(n);
//    	 }
//    	 
//    	 
//	}
     
     
     
		
	}

}
