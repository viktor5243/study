package chapter4;
import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数A：");
		int a = scn.nextInt();
		System.out.print("整数B：");
		int b = scn.nextInt();
		
		if(a > b) { //aがbより大きければそれらの値を交換
			int t = a; a = b; b =t;
		}
		do {
			System.out.print(a + " ");
			a = a + 1;
		}while( a <= b);
		System.out.print(" ");
	}
}
