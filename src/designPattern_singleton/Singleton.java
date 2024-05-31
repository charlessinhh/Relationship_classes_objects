package designPattern_singleton;

public class Singleton {
	
	/* 1. private constructor
	 * 2. create method that returns the static final singleton object
	 * 3. create an class instance
	 * 4. global access to the instance that stores the object thourgh public method.
	 * 
	 */
	
	
	//1. lazy initialization ->
	
	private static Singleton instance ;
	
	//private constructor
	private Singleton(){};
	
//	public static Singleton getObject() {
//		instance = new Singleton();
//		return instance;
//	}
	
//	singleton pattern-> 
//	public static Singleton getObject() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	singleton pattern-> with synchronised method 
//	public synchronized static  Singleton getObject() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	singleton pattern-> with synchronised bock help in thread-safe
	public static  Singleton getObject() {
		
		if(instance == null) {
			synchronized(Singleton.class) {
				instance = new Singleton();
			}
			
		}
		return instance;
	}
	
	
}
