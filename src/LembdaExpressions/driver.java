package LembdaExpressions;

interface Cab2 {

	public void bookCab(String source, String destination);
}

class ola4 implements Cab2 {

	@Override
	public void bookCab(String source, String destination) {

		System.out.println("Ola cab is booked from " + source + "To" + destination);
	}

}

public class driver {

	public static void main(String[] args) {
		Cab2 cab = new ola4();
		cab.bookCab("Noida", "Delhi");
	}

}
