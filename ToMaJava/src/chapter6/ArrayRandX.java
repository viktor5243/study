package chapter6;
import java.util.Scanner;
import java.util.Random;

public class ArrayRandX {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = scn.nextInt();
		int [] a = new int[n];
		
		a[0] = 1 + rand.nextInt(10);
		for(int i = 1; i < n; i++) {
			do {
			a[i] = 1 + rand.nextInt(10);
			} while (a[i-1] == a[i]);
		}
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}
}
