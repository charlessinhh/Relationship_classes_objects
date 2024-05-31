package designPattern_singleton;

public class EagerSingleton {
	
	//at the tame of class loading
	private static EagerSingleton instance = new EagerSingleton(); 
	
	public static EagerSingleton getObject() {
		return instance;
	}
}
