package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size - 15 inches");
	}
	public static void main(String[] args) {
		Desktop specification=new Desktop();
		specification.computerModel();
		specification.desktopSize();
	}

}
