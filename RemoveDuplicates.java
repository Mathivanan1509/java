package org.test;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	String text = "We learn java basics as a part of java sessions in java";
	int count;
	String space ="";
	String [] words = text.split(" ");
	for (int i = 0; i < words.length; i++) {
		String total = words[i];
		count = 0;
		for (int j = 0; j < words.length; j++) {
			if(total.equals(words[j])) {
				count=count+1;
				if(count>1) {
					words[j]="";
				}
			}
		}
		if(!total.equals(" ")) {
			space=space +total+" ";
		}
		
	}
	System.out.println(space);
	}
	
	
}
