package chapter3;
import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("変数a:");
		int a = scn.nextInt();
		System.out.print("変数b:");
		int b = scn.nextInt();
		System.out.print("変数c:");
		int c = scn.nextInt();
		
		if(a > b) {
			int t = a; a = b; b = t;		
		}
		if(b > c) {
			int t = b; b = c; c = t;
		}
		if(a > b) {
			int t = a; a = b; b = t;
		}
		System.out.println("a≦b≦cとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
		System.out.println("変数cは" + c + "です。");
	}
}
