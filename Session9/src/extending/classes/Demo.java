package extending.classes;

public class Demo {

	public static void main(String[] args) {
		
//		MountainBicycles mb = new MountainBicycles("Hero", 4, 10);
//		
//		mb.stopMountainBicycle();
//		
//		Bicycle b;
//		
//		b = new MountainBicycles("Atlas", 3, 5);
//		
//		System.out.println(b.getBrand());
//		System.out.println(b.getGears());
//		
//		b.applyBrakes();
//		
//		Bicycle bo = new Bicycle();
//		
//		bo.setBrand("Hero Moto");
//		bo.setGears(5);
//		
//	//X MountainBicycles mb001 = new Bicycle();
		
	
		Base base  = new Derived() ;
		
	//	base.displayInfo();
		
		Base b03 = new Base();
		
		b03.displayInfo();
	
		 Base b1 = new Base();
		
	     System.out.println(b1.getY());
		
		 System.out.println(b1.getX());

	}

}
