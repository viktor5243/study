package chapter3;
import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数A：");
		int a = scn.nextInt();
		System.out.print("整数B：");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("それらの差は" + (diff<=10 ? "10以下" : "11以上") + "です。");
	}
}
