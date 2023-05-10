package week2.day3o1;

public class Calculator {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void multipleTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumber(float x,float y) {
		float z=x%y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.additionTwoNumber(45, 55);
		calc.subtractionTwoNumber(35, 25);
		calc.multipleTwoNumber(450.500, 500.600);
		calc.divideTwoNumber(40.500F, 50.600F);
	}

}
