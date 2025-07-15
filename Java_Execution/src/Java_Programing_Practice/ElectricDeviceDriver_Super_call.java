package Java_Programing_Practice;

public class ElectricDeviceDriver_Super_call {
	public static void main(String[] args) {
		
		ElectricDevice_Super_call e2=new AC ("Godrej", 2.5, 1.5);
		System.out.println(e2.name);
		System.out.println(e2.volt);
		AC a=(AC)e2;
		System.out.println(a.ton);
		
		ElectricDevice_Super_call e3=new Refrigerator ("Worlpool", 500, 2);
		System.out.println(e3.name);
		System.out.println(e3.volt);
		Refrigerator r= (Refrigerator) e3;
		System.out.println(r.noOfdoors);	
	}
}
