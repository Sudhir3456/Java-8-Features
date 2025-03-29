package predicates;

import java.util.function.Predicate;

//Predicate -----. one Prameter retrurn boolean
// use only if you have conditional checks in your program...

public class Demo1 {

	public static void main(String[] args) {

		// ex1
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(20)); // true
		System.out.println(p.test(5)); // false

		// ex2 : check the length of given string is grater then 4 or not.
		Predicate<String> pr = s -> (s.length() > 4);
		System.out.println(pr.test("welcome")); // true
		System.out.println(pr.test("xyz")); // false

	}

}
