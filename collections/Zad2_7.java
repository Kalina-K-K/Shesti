package collections;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;


public class Zad2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
//		int index=0;
		try {
		      File myObj = new File("ToDoList.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNext()) {
		        String data = myReader.next();
//		        list1.add(index,data);
//		        index++;
		        list1.add(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Collections.sort(list1);
		System.out.println(list1);
	}

}
