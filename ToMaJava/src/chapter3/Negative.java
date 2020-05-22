package chapter3;
import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数値：");		
		int a = scn.nextInt();
		
		if(a<0) {
			System.out.println("その値は負です。");
		}
	}
}
