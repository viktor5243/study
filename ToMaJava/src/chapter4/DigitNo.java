package chapter4;
import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("正の整数値の桁数を求めます。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = scn.nextInt();
		}while(x <= 0);
		
		int digits = 0;
		while(x > 0) {
			digits++;
			x /= 10;
		}
		System.out.println("その数は" +digits +"桁です。");
	}
}
