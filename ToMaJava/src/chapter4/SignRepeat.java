package chapter4;
import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int retry; //もう一度？
		
		do {
			System.out.print("整数値：");
			int n = scn.nextInt();
			
			if(n > 0) 
				System.out.println("その値は正です。");
			else if(n < 0)
				System.out.println("その値は負です。");
			else
				System.out.println("その値は0です。");
		
			System.out.print("もう一度？ 1…Yes／0…No：");
		retry = scn.nextInt();
		
		} while (retry == 1);
	}
}
