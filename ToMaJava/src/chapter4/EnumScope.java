package chapter4;
import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����A�F");
		int a = scn.nextInt();
		System.out.print("����B�F");
		int b = scn.nextInt();
		
		if(a > b) { //a��b���傫����΂����̒l������
			int t = a; a = b; b =t;
		}
		do {
			System.out.print(a + " ");
			a = a + 1;
		}while( a <= b);
		System.out.print(" ");
	}
}
