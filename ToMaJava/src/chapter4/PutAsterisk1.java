package chapter4;
import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����F");
		int x = scn.nextInt();
		
		while(x > 0)
			do {
				System.out.print("*");
				x--;
			}while(x > 0);
		System.out.println();
	}
}
