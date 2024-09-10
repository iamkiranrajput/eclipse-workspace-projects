package com.task;

public class vowalcount {
public static void main(String[] args) {
	String s="hello there we all are one big family";
	int v=0;
	int c=0;
	for(int i=0; i<s.length()-1; i++) {
		if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u') {
			v++;
		}
		else if(s.charAt(i)!=' ') {
			c++;
		}
		
	
	}
	System.out.println(c++);
	System.out.println(v++);
	
}
}
