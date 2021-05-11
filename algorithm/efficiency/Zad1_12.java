package algorithm.efficiency;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[]list1 = {2,5,8,9};
     //   ArrayList<Integer> list2 = new ArrayList(Arrays.asList(2,3,4,6));
        System.out.println("Enter a sum: ");
        int sum = sc.nextInt();
        System.out.println(hasPair_BruteForce(list1,sum));
        System.out.println(hasPair_Binary(list1,sum));
        System.out.println(hasPair_FromBothEnds(list1,sum));
        System.out.println(hasPair_HashSet(list1,sum));
	}
public static boolean hasPair_BruteForce(int[] list,int sum) { // O(n^2)
	for(int i=0; i < list.length; i++) {
		for(int j = i+1; j<list.length; j++) {
			if(list[i]+list[j]==sum) {
				return true;
			}
			
			}
		}return false;
	}

        public static boolean hasPair_Binary(int[] list,int sum) { // O(nlog(n))
	       for(int i=0; i < list.length; i++) {
		      if(BinarySearch.binarySearch(list,sum - list[i])> 0){
		    	return true;
			}
			}return false;
        }
		
        
        public static boolean hasPair_FromBothEnds(int[]list, int sum) { // O(n)
         int lastIndex=list.length -1;
         int firstIndex=0;
         while(lastIndex>firstIndex) {
        	 int currentSum = list[lastIndex]+list[firstIndex];
        	 if(currentSum>sum) {
        		 lastIndex--;
        	 }else if(currentSum<sum) {
        		 firstIndex++;
        	 }else {
        		return true; 
        	 }
         }return false;
}

        public static boolean hasPair_HashSet(int[]list, int sum) { //O(n)
        	Set<Integer> rests = new HashSet<Integer>();
        	for(int i=0;i<list.length;i++) {
        		if(rests.contains(list[i])) {
        			return true;
        		}
        		rests.add(sum-list[i]);
        		}
        	return false;
        }

}
