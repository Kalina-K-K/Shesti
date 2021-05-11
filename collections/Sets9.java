package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets9 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/collections/Test.java");
		if (file.exists()) {
			 countVowelsAndConsonants(file);
		} else {
			System.out.println("File does not exist");
		}

	}

	public static void countVowelsAndConsonants(File file) throws Exception {
// Array of all Java keywords + true, false and null
		Character[] vowelsString = { 'a', 'A', 'o', 'O', 'i', 'I', 'e', 'E', 'u', 'U' };
		Set<Character> vowelsSet = new HashSet<Character>(Arrays.asList(vowelsString));
		int glasni = 0;
		int suglasni=0;
		
		FileReader fr;
		try {
			fr=new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int c = 0;
			while((c=br.read())!= -1) {
				char ch = (char)c;
				if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				if(vowelsSet.contains(ch)) {
					glasni++;
				}else {
					suglasni++;
				}
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Гласни: " + glasni + "\n" + "Съгласни: " + suglasni);

}
}
