package javapratice;

import java.util.HashSet;
import java.util.Set;

public class reversestring {

	public static void main(String[] args) {
		
		String rev="";
		
	String h="selenium";
	for(int i=h.length()-1;i>=0;i--){
		rev=rev+h.charAt(i);
	}
		
	System.out.println(rev);	
		
		
	}
}