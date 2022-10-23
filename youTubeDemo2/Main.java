package youTubeDemo2;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.Id=1;		
		customer.City="Ankara";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.TaxNumber = "415154651";
		company.CompanyName = "Arçelik";
		company.Id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Customer());
		customerManager2.Save();
		customerManager2.Delete();
		
		Person person = new Person();
		person.NationalIdentity = "1216521461";
		person.FirstName="Engin";
		person.LastName="Demiroğ";
		
		

	}

}
