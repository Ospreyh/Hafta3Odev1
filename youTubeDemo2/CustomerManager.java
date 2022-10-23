package youTubeDemo2;

public class CustomerManager {
	private Customer _customer;
	public CustomerManager (Customer customer) {
		_customer = customer;
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi : " );
	}
	public void Delete() {
		System.out.println("Müşteri silindi : " );
	}
}
