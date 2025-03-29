package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterdemos3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("ram", "rakesh", "rahul", "mukesh", "rama");
		List<String> longnames = new ArrayList<String>();
		
		//longnames= names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
		
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
		

	}

}
