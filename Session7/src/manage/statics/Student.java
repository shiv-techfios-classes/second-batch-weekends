package manage.statics;

public class Student {
	
	private int rollNo;
	
	private String name;
	
		
	public Student(int roll_n, String studentname) {
		
		System.out.println("Hello from 2 parameter constructor.");
		this.rollNo = roll_n;
		this.name = studentname;
	}
	
//	public Student() {
//		
//		System.out.println("default constructor.");
//		
//	}
	
	public Student(int roll_n) {
		
		System.out.println("Single argument constructor:" + roll_n);
		
		this.rollNo = roll_n;
	}
	

	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name ==null) {
			name ="";
		}
		if(name.equals("")) {
			name = "test";
		}
		this.name = name;
	}

	public static void main(String[] args) {
		
//		Student std1 = new Student();
		
		Student std2 = new Student(10);
		
		new Student(21);
		
		Student s3 = new Student(1, "Mahesh");
		
		Student s4 = new Student(2, "Anil");
		
		Student s5 = new Student(3, "Sunil");
		
		Student s6 = new Student(4, "Pushp");
		
		s6.setName("Billu singh");
		
		System.out.println(s6.getName());
		
		//s3.setFields("Suresh", 10);
		
		System.out.println(s3.name+"," + s3.rollNo);
	}

}
