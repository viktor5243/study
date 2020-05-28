package chapter6;
import java.util.Scanner;
import java.util.Random;

public class ColumnChart {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = scn.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);
		
		for(int i = 10; i >= 1; i--) {
			for(int j = 0; j < n; j++)
				if(a[j] >= i) 
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
		
		for(int i = 0; i < 2 * n; i++)
			System.out.print("-");
		System.out.println();
		
		for(int i = 0; i < n; i++)
			System.out.print(i % 10 + " ");
		System.out.println();
	}
}
