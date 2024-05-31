package designPattern_singleton;

public class Demo {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getObject();
		Singleton obj2 = Singleton.getObject();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		EagerSingleton obj3 = EagerSingleton.getObject();
		EagerSingleton obj4 = EagerSingleton.getObject();
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
