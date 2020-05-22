package chapter3;
import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = scn.nextInt();
		
		if(n>0) 
			System.out.println("その値は正です。");
		else if(n==0) 
			System.out.println("その値は0です。");
		else
			System.out.println("その値は負です。");
	}
}
