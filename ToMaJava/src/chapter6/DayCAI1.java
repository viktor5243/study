package chapter6;
import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		
		String [] weekString = {"sunday","monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		String [] jpWeekString = {"日", "月", "火", "水", "木", "金", "土"};
		
		System.out.println("英語の曜日名を小文字で入力してください。");
		int retry;
		int last = -1;
		String answer;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			
			while(true) {
				System.out.print(jpWeekString[day] + "曜日：");
				answer = scn.next();
				
				if(answer.equals(weekString[day]))
					break;
				else
					System.out.println("違います。");	
			}
			System.out.print("正解です。もう一度？　1…Yes／2…No：");
			retry = scn.nextInt();
		} while (retry == 1);	
	}
}
