package algorithm.efficiency;

public class Zad1_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 50_000;
		int[] arrB = new int[n];
		int[] arrS = new int[n];
		int[] arrM = new int[n];
		int[] arrQ = new int[n];
		
		for(int i=0; i<n; i++) {
			int element =(int)(Math.random()*1000); //random integers in an aaray
			
			arrB[i] = element;
			arrS[i] = element;
			arrM[i] = element;
			arrQ[i] = element;
			
		}
		 
		long timeB = 0, timeS = 0, timeM = 0, timeQ = 0;
		long startTime  = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB);
		timeB = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS);
		timeS = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		MergeSort.mergeSort(arrM);
		timeM = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(arrQ);
		timeQ = System.currentTimeMillis() - startTime;
		
		String formatHeader ="%-12s%-7s%-10s%-7s%-7s%n";
		String formatTimeData = "%,-12d%-7d%-10d%-7d%-7d%n";
		
		System.out.printf(formatHeader, "Array size", "Bubble", "Selection", "Merge","Quick");
		System.out.printf(formatTimeData, n,timeB,timeS,timeM,timeQ);
	}

}
