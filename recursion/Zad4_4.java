package recursion;

public class Zad4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mas[] = {18, 11, -3};
        int dul = mas.length;
      
        System.out.println(average(mas, dul));
	}
	
    static double average(int a[], int n)
    {
         return avgRec(a, 0, n);
    }
	
	static double avgRec(int a[], int i, int n)
    {
        if (i == n-1)
            return a[i];
      
        if (i == 0)
            return ((a[i] + avgRec(a, i+1, n))/n);
      
        return (a[i] + avgRec(a, i+1, n));
    }
}

