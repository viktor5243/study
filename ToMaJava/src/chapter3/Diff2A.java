package chapter3;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = scn.nextInt();
		System.out.print("整数b：");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("それらの差は" +diff +"です。");
	}
}
