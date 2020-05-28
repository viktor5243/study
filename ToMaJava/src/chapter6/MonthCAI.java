package chapter6;
import java.util.Scanner;
import java.util.Random;

public class MonthCAI {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		String [] monthString = {"January", "February", "March", "April", "May", "Jun", "July",
				"August", "September", "October", "November", "December"};
		
		System.out.println("英語の月名を入力して下さい。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		int retry; //もう一度
		int last = -1; //前回の月
		do {
			int month;
			do {
				month = rand.nextInt(11);
			} while (month == last);
			last = month;
			
			while(true) {
				System.out.print((month + 1) + "月：");
				String answer = scn.next();
				
				if(answer.equals(monthString[month])) 
					break;
				else
					System.out.println("違います。");	
			}
			System.out.print("正解です。もう一度？　1…Yes／2…No：");
			retry = scn.nextInt();
		} while (retry == 1);
	}
}
