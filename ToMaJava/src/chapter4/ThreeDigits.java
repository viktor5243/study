package chapter4;
import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("3桁の正の整数値：");
			n = scn.nextInt();
			
		} while ((n < 100 || n > 999));
		
		System.out.println(n + "と入力しましたね。");
	}
}
