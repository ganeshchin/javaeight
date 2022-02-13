package javaeightone;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	  
}
public class Testt {

	public static void main(String[] args) {
		ArrayList<Employee> l= new ArrayList<Employee>();
		l.add(new Employee("suresh",2000));
//		l.add(new Employee("nuresh",5000));
//		l.add(new Employee("buresh",6000));
//		l.add(new Employee("muresh",7000));
		l.add(new Employee("ruresh",28000));
		Predicate<Employee> p= e->e.salary>1000;
		for(Employee e1:l) {
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
		}

	}

}}
