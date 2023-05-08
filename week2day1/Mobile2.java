package week2.day2;

public class Mobile2 {
	String mobileBrandName="Redmi";
	char mobileLogo='m';
	short noOfMobilepiece=150;
	int modelNumber=105;
	long modelImeiNumber=98745677723L;
	float mobilePrice=8500.50F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		Mobile2 specifications=new Mobile2();
		System.out.println(specifications.mobileBrandName);
		System.out.println(specifications.mobileLogo);
		System.out.println(specifications.noOfMobilepiece);
		System.out.println(specifications.modelNumber);
		System.out.println(specifications.modelImeiNumber);
		System.out.println(specifications.mobilePrice);
		System.out.println(specifications.isDamaged);
	}

}
