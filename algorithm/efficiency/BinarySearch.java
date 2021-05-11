package algorithm.efficiency;

public class BinarySearch {
	public static int binarySearch(int[] list, int key) {
		// T(n) = ?
		// T(n) = O(logN)
		// n / 2 ^ i = 1
		//n = 2 ^ i
		// i = logN
		// T(n/2) = c + T(n/4)
		// T(n/4) = c + T(n/8)
		// T(n/8) = c + T(n/16)
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}
	
	

	public static void main(String[] args) {
		int[] list = { 2, 4, 7, 10, 11, 45, 50, 59};
		
		// T(n) = O(n)
		int key = 6;
		int index = -1;
		for( int i = 0; i < list.length; i++ ) {
			if( list[i] == key ) {
				index = i;
			}
		}
		

		int i = BinarySearch.binarySearch(list, 2); // Returns 0
		System.out.println(i);
		int j = BinarySearch.binarySearch(list, 11); // Returns 4
		System.out.println(j);
		int k = BinarySearch.binarySearch(list, 12); // Returns –1
		int l = BinarySearch.binarySearch(list, 1); // Returns –1
		int m = BinarySearch.binarySearch(list, 3); // Returns –1
	}
}
