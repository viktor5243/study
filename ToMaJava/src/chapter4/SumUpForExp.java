package chapter4;
import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1‚©‚çn‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
		int x = 0;
		do {
			System.out.print("n‚Ì’lF");
			x = scn.nextInt();
		}while(x <= 0);
		
		int sum= 0;
		for(int i = 0; i < x; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.print(x + "=");
		sum += x;
		System.out.println(sum);
	}
}
