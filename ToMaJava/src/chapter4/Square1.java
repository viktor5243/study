package chapter4;
import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("n‚Ì’lF");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i + "‚Ì2æ‚Í" + i * i);
	}
}
