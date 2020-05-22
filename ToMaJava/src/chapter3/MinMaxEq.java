package chapter3;
import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = scn.nextInt();
		System.out.print("整数b：");
		int b = scn.nextInt();
		
		if(a == b) 
			System.out.println("2つの値は同じです。");
		else {
			int min, max;
			if(a < b) {
				min = a;
				max = b;
			} else {
				min = b;
			    max = a;
			}
			System.out.println("小さい方の値は" + min + "です。");
			System.out.println("大きい方の値は" + max + "です。");
		}
	}
}
