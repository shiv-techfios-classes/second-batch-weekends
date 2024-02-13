package exercise.inheritance;

public class HRManager extends Employee {

	public HRManager(String name, long salary) {
		super(name, salary);
	}

	public void work(String task) {
		
		System.out.println(this.getName() +" HR Manager working on " + task);
	}

	public void addEmployee(Employee emp) {
		
		System.out.println("Added employee " + emp + " to the payroll.");
	}
	
}
