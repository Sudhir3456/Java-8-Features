package filterdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterdemos2 {

	public static void main(String[] args) {

     List<String> words =Arrays.asList("cap",null,"rahul", null, "radha","rama", "ganesh","rakes");
     
     List<String>  result=words.stream().filter(w->w!=null).collect(Collectors.toList());
     
     System.out.println(result);
		
		
	}

}
