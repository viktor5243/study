package chapter4;
import java.util.Scanner;

public class Measure {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.print("®”’lF");
		int n = scn.nextInt();
		
		int count = 0; //–ñ”‚ÌŒÂ”
		for(int i = 1; i <= n; i++)
			if((n % i) == 0) {
				count++;
				System.out.print(i + " ");
			}
		System.out.println("\n–ñ”‚Í" + count + "ŒÂ‚Å‚·B");
	}
}
