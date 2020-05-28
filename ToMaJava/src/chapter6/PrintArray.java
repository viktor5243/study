package chapter6;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("—v‘f”F");
		int n = scn.nextInt();
		
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextInt();
		}
		System.out.print("a = {");
		if(n >= 2)
			for(int i = 0; i < n-1; i++)
				System.out.print(a[i] + ", ");
		if(n >= 1)
			System.out.print(a[n-1]);
		System.out.print("}");
	}
}
