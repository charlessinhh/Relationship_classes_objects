package designPattern_FactoryMethod;

public class Mobile_Factory {
	
	public static Mobile createMobile(String mobName) {
		mobName = mobName.trim();
		
		if(mobName == null || mobName.isEmpty()) return null;
		
		else if(mobName.equals("Samsung")) {
			return new Samsung();
		}
		else if(mobName.equals("Apple")) {
			return new Apple();
		}
		else if(mobName.equals("OnePlus")) {
			return new OnePlus();
		}
		else {
			return null;
		}
	}
}
