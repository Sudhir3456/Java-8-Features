/*
 * package functions;
 * 
 * import java.util.ArrayList; import java.util.function.Function; import
 * java.util.function.Predicate;
 * 
 * class Employee { String ename; int salary;
 * 
 * public Employee(String ename, int salary) { super(); this.ename = ename;
 * this.salary = salary; }
 * 
 * }
 * 
 * 
 * 
 * public class Demo2 {
 * 
 * public static void main(String[] args) {
 * 
 * ArrayList<Employee> emplist = new ArrayList<Employee>(); emplist.add(new
 * Employee("David", 50000)); emplist.add(new Employee("Rana", 90000));
 * emplist.add(new Employee("Rahul", 40000)); emplist.add(new Employee("Dipak",
 * 60000));
 * 
 * 
 * // Function<Employee, Integer> fn=e->{
 * 
 * int sal=e.salary; if (sal>=10000 && sal<=20000) return (sal *10/100); else if
 * (sal>=20000 && sal<=30000) return (sal *20/100); else if (sal>=30000 &&
 * sal<=40000) return (sal *30/100); else if (sal>=40000 && sal<=50000) return
 * (sal *40/100); };
 * 
 * Predicate<Integer> p=b->b>5000;
 * 
 * for (Employee emp : emplist) {
 * 
 * int bonus=fn.apply(emp); //Function if(p.test(bonus)) //predicated {
 * 
 * System.out.println(emp.ename+" "+emp.salary);
 * System.out.println("bonus is : "+bonus);
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */