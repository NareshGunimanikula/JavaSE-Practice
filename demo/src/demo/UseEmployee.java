package demo;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("Naresh", 100);
		System.out.println(e.getSalary());
		e.setHr(25);
		Employee.setHr(25);
		System.out.println(e.getSalary());

	}
}

class Employee{
	private String name;
	private int salary;
	private static int hraper = 20;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public int getSalary() {
		return salary + salary * hraper / 100;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void setHr(int hr) {
		hraper = hr;
	}
}
