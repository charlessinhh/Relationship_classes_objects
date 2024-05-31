package designPattern_FactoryMethod;

public class OnePlus implements Mobile {
	
	@Override
	public void createMobile() {
		System.out.println("Creating Oneplus mobile");
	}

	@Override
	public int mobilePrice() {
		System.out.println(" Oneplus price");
		int price = 20000;
		return price;
	}
}
