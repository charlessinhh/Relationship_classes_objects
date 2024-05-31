package designPattern_FactoryMethod;

public class Main {

	public static void main(String[] args) {

		// without pattern
		OnePlus obj1 = new OnePlus();
		obj1.createMobile();
		System.out.println(obj1.mobilePrice());

		// without pattern
		Samsung obj2 = new Samsung();
		obj2.createMobile();
		System.out.println(obj2.mobilePrice());

		// without pattern
		Apple obj3 = new Apple();
		obj3.createMobile();
		System.out.println(obj3.mobilePrice());
		
		
		//Factory-design pattern
		
		Mobile sm = Mobile_Factory.createMobile("Samsung");
		sm.createMobile();
		System.out.println(sm.mobilePrice()); 
		
		//Factory-design pattern
		Mobile ap = Mobile_Factory.createMobile(" Apple");
		ap.createMobile();
		System.out.println(ap.mobilePrice());
		
		//Factory-design pattern
		Mobile op = Mobile_Factory.createMobile(" OnePlus ");
		op.createMobile();
		System.out.println(op.mobilePrice());
	}

}
