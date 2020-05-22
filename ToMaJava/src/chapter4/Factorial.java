package chapter4;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int x = 0;
		do {
			System.out.print("³‚Ì®”’lF");
			x = scn.nextInt();
		}while(x <= 0);
		
		int multi= 1;
		int i =1;
		while(i <= x) {
			multi *= i;
			i++;
		}
		System.out.println("1‚©‚ç" + x + "‚Ü‚Å‚ÌÏ‚Í" + multi + "‚Å‚·B");
	}
}
