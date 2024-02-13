package exercise.inheritance;

public class Employee {
	
	private String name;
	
	private long salary =200;
	

	public Employee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void work(String task) {
		
		System.out.println("Employee "+ this.name+ "working on " + task);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
