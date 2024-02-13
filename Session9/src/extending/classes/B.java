package extending.classes;

public class B extends A{

	double salary=1000;
	
	void display() {
		
		System.out.println("I am from class B.");
	}
	
	public static void main(String[] args) {
		
		B obj01 =  new B();
		
		System.out.println(obj01.salary);
		
		System.out.println(obj01.count);
		
		obj01.print();
		
		C obj02 = new C();
		
		obj02.print();
		
		obj02.display();
		
		
		A a1 = new A();
		
		A a2 = new B();
		
		if( a1 instanceof B) {
			System.out.println("a1 is object of B");
		}
		
		if(a2 instanceof B) {
			System.out.println("a2 is object of B");
		}
		
		
	}
}
