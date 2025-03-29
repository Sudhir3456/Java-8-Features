package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String ename;
	int salary;
	int experience;

	public Employee(String ename, int salary, int experience) {

		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}

}

public class Demo2 {
	public static void main(String[] args) {

		// Ex1
		Employee emp = new Employee("john", 20000, 2);

		// emp obj----> return name if sal>50k exp>3
		Predicate<Employee> pr = e -> (e.salary > 300 && e.experience > 3);
		// System.out.println(pr.test(emp));

		ArrayList<Employee> a1 = new ArrayList<Employee>();

		a1.add(new Employee("ram", 50000, 5));
		a1.add(new Employee("rakesh", 70000, 6));
		a1.add(new Employee("raman", 50000, 7));
		a1.add(new Employee("rahul", 507000, 5));
		a1.add(new Employee("rama", 89000, 8));
		a1.add(new Employee("rakeskm", 5090000, 3));
		a1.add(new Employee("syaam", 50900, 2));

		for (Employee employee : a1) {

			if (pr.test(employee)) // if e.sal>50k e.exp>3
			{
				System.out.println(employee.ename + " " + employee.salary);

			}
		}

	}

}