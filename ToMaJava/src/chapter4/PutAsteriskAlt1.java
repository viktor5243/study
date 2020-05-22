package chapter4;
import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ•\Ž¦‚µ‚Ü‚·‚©F");
		int n = scn.nextInt();
		
		if(n > 0) {
			int i = 0;
			while(i < n) {
				
				if((i % 2) == 0) 
					System.out.print("+");
				else
					System.out.print("*");
				i++;
			}
			System.out.println();
		}
	}
}
