package algorithm.efficiency;

import java.util.Comparator;

public class Zad1_14_Comparator {
	public static <E> void mergeSort(E[] list, Comparator<E> comparator) {
		if (list.length > 1) {
// Merge sort the first half
			E[] firstHalf = (E[]) new Object[list.length / 2]; //masiv ot referencii ot tipa Comparable
			                                                       //obekti ot klasove , ne ot interface
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf, comparator);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			E[] secondHalf = (E[]) new Object[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf, comparator);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list, comparator);
		}
	}

	/** Merge two sorted lists */
	public static <E> void merge(E[] list1, E[] list2, E[] temp,  Comparator<E> comparator) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (comparator.compare(list1[current1], list2[current2]) <0)     // <
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	/** A test method */
//	public static void main(String[] args) {
//		Circle[] list = { new Circle(2), new Circle(3), new Circle(2), new Circle(5), new Circle(6), new Circle(1), new Circle(12), new Circle(3), new Circle(14), new Circle(12)};
//		
//		mergeSort(list, new CircleComparator());
//		for (int i = 0; i < list.length; i++)
//			System.out.print(list[i] + " ");
//	}
}
