package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	
	String dename;
	int salary;
	String gender;
	public Employee(String dename, int salary, String gender) {
		super();
		this.dename = dename;
		this.salary = salary;
		this.gender = gender;
	}
	
	
	
}




public class Demo2 {

	public static void main(String[] args) {

       ArrayList<Employee> emplist= new  ArrayList<Employee>();
       emplist.add(new Employee("David", 500000, "Male"));
       emplist.add(new Employee("Rajesh", 450000, "Male"));
       emplist.add(new Employee("Rani", 50000, "FeMale"));
       emplist.add(new Employee("Sakesh", 600000, "Male"));
       emplist.add(new Employee("Dipaka", 900000, "FeMale"));
       
       
       //Functions
       Function<Employee, Integer> f=emp->(emp.salary*10)/100;  //task1
       
       //Predicate
       Predicate<Integer> p=b->b>=5000;
       
       //Consumer
       Consumer<Employee> c=emp->{
    	   System.out.println(emp.dename);
    	   System.out.println(emp.salary);
    	   System.out.println(emp.gender);
       };
       
       for (Employee e : emplist) {
    	   
    	   int bonus=f.apply(e);  //cal bonus   invoked function
    	   
    	   if(p.test(bonus))   //invoked predicate
    	   {
    		   c.accept(e);   //invoked consumer
    		   System.out.println("Employee bounus "+bonus);
    	   }
		
	}
       
       

       
       
       
	}

}
