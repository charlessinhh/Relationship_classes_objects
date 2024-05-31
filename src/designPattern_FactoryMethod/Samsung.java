package designPattern_FactoryMethod;

public class Samsung implements Mobile{
	
	@Override
	public void createMobile() {
		System.out.println("Creating Samsung mobile");
	}

	@Override
	public int mobilePrice() {
		System.out.println(" Samsung price");
		int price = 80000;
		return price;
	}
}
