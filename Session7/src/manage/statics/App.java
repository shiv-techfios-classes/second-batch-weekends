package manage.statics;

public class App {
	
		public static void main(String[] args) {
			
			
			test2();
			
			Test.display("something");
		

			Student s1 = new Student(101, "Ballu");
			
			s1.setName(null);
				
	}
		
	
	static	void test1() {
		
		System.out.println("test1 called and it is static method.");
			
		}
	
	static void test2() {
		
		System.out.println("test2 called and it is a static method.");
		
		test1();
	}
		
	
	void test3() {
		
		System.out.println("test3 called and it is non-static.");
		
		test4();
		
		Test t1 = new Test();
		
		t1.calculateSquare(5);
	}
	
	void test4() {
		
		System.out.println("test4");
	}
		

}
