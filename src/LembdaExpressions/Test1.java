package LembdaExpressions;

interface Cab1 {

	public void bookCab(String source, String destinations);
}

public class Test1 {

	public static void main(String[] args) {

		Cab1 cab = (source, destinations) ->  System.out.println("Ola cab is booked from  " + source + " To " + destinations);
		cab.bookCab("noida", "delhi");
		
		
 
	}

}
