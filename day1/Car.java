package wee1.day1;

public class Car {
	public void applyAcclerator() {
		System.out.println("User can apply acclerator");
	}
	public void applyBreak() {
		System.out.println("User can apply break");
	}
public void applyGear() {
	System.out.println("User can shift gear");
}
public void swithOnAc() {
	System.out.println("User can swith on AC");
}
public static void main(String[] args) {
	Car features=new Car();
	features.applyAcclerator();
	features.applyBreak();
	features.applyGear();
	features.swithOnAc();
}
}
