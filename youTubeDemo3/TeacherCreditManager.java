package youTubeDemo3;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void Calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}
	//DRY - Don't Repeat Yourself prensibi dolayısıyla kaydedildi 
	//tek mesaja dönüştürüldü. ve Abstract Class oluşturuldu.
	
		
	

}
