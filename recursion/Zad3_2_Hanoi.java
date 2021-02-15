package recursion;

import java.util.Scanner;

public class Zad3_2_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number of disks: ");
				int n = input.nextInt();
				// Find the solution recursively
				System.out.println("The moves are:");
				moveDisks(n, 'A', 'B', 'C');
				System.out.println("Moves: " + moves(n));
			}

			/**
			 * The method for finding the solution to move n disks from fromTower to toTower
			 * with auxTower
			 */
			public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
				if (n == 1) { // Stopping condition
					System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
				} else {
					moveDisks(n - 1, fromTower, auxTower, toTower);
					System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
					moveDisks(n - 1, auxTower, toTower, fromTower);
				}
	}
			public static int moves(int n) {
				if(n==0) {
					return 0;
				}else {
					return 2*moves(n-1)+1;
				}
			}

}
