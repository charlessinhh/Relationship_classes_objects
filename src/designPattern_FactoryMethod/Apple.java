package designPattern_FactoryMethod;

public class Apple implements Mobile{

	@Override
	public void createMobile() {
		System.out.println("Creating Apple mobile");
		
	}

	@Override
	public int mobilePrice() {
		// TODO Auto-generated method stub
		System.out.println(" Apple price");
		int price = 120000;
		return price;
	}

}
