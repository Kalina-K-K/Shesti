package algorithm.efficiency;

import java.util.Scanner;

public class Zad1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine();
		System.out.println("Enter second string");
		String str2 = sc.nextLine();
		
		boolean contains = true;
		
		char[] s1 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            s1[i] = str1.charAt(i);
        }
        
        char[] s2 = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            s2[i] = str2.charAt(i);
        }
        
        for(int i = 0; i<str1.length();i++) {
        	if(s1[i]==s2[0]) {
            	contains=true;
        		for(int j=1;j<s2.length;j++) {
        			if(s1[j+i]!=s2[j]) {
        				contains = false;
        				break;
        			}
        		}
        		if(contains) {
        			break;
        		}
        	}
        }
        if(contains) {
        	System.out.println("String 1 contains string 2");
        }else {
        	System.out.println("String 1 does not contain string 2");

        }
	}

}
