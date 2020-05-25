package chapter4;
import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("季節を求めます。");
		
		int retry; //もう一度？
		do {
			int month;
			do {
				System.out.print("何月ですか：");
				month = scn.nextInt();
			} while (month < 1 || 12 < month);
		
			if (3 <= month && month <= 5) {
				System.out.println("それは春です。");
			} else if (6 <= month && month <= 8) {
				System.out.println("それは夏です。");
			} else if (9 <= month && month <= 11) {
				System.out.println("それは秋です。");
			} else if (month == 12 || month == 1 || month == 2) {
				System.out.println("それは冬です。");
			}
		
			System.out.print("もう一度？　1…Yes／0…No：");
			retry = scn.nextInt();
			
		} while(retry == 1);
	}
}
