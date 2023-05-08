package week2.day2;

public class TwoWheeler2 {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 98767856745L;
	boolean isPunctured = false;
	String bikeName = "R15";
	double runningKM = 80.05;
	 
	public static void main(String[] args) {
		TwoWheeler2 feature = new TwoWheeler2();
		System.out.println(feature.noOfWheels);
		System.out.println(feature.noOfMirrors);
		System.out.println(feature.chassisNumber);
		System.out.println(feature.isPunctured);
		System.out.println(feature.bikeName);
		System.out.println(feature.runningKM);
	}
}
