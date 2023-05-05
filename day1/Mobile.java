package wee1.day1;

public class Mobile {
public void useFlashlight() {
	System.out.println("User can use flashlight");
}
public void makeCall() {
	System.out.println("User can make phone call");
}
public void listenMusic() {
	System.out.println("User can listen music");
}
public void playGames() {
System.out.println("User can play games");
}
public static void main(String[] args) {
	Mobile specification=new Mobile();
	specification.useFlashlight();
	specification.makeCall();
	specification.listenMusic();
	specification.playGames();
}
}
