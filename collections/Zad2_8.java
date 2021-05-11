package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Zad2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> braces = new Stack<>();
		File myFile = new File("src/collections/Test.java");
		FileReader fr;
		try {
			fr=new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);
			int c = 0;
			boolean conflict = false;
			while((c=br.read())!= -1) {
				char ch = (char)c;
				if(ch=='('||ch=='['||ch=='{') {
					braces.add(ch);
				}else if(ch==')') {
					conflict = braces.pop() != '(';
				}else if(ch==']') {
					conflict = braces.pop() != '[';
				}else if(ch=='}') {
					conflict = braces.pop() != '{';
				}
				if(conflict) {
					break;
				}
			}
			if(conflict||!braces.isEmpty()) {
				System.out.println("Mismatched braces");
			}else {
				System.out.println("No mismatched braces");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
