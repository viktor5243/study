package chapter3;
import java.util.Scanner;

public class Absolute1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数値：");
		int n = scn.nextInt();
		
		if(n>=0) {
			System.out.println("その絶対値は" +n +"です。");
		}else {
			System.out.println("その絶対値は" +(-n) +"です。");
		}	
	}
}
