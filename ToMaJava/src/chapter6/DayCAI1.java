package chapter6;
import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		
		String [] weekString = {"sunday","monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		String [] jpWeekString = {"��", "��", "��", "��", "��", "��", "�y"};
		
		System.out.println("�p��̗j�������������œ��͂��Ă��������B");
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
				System.out.print(jpWeekString[day] + "�j���F");
				answer = scn.next();
				
				if(answer.equals(weekString[day]))
					break;
				else
					System.out.println("�Ⴂ�܂��B");	
			}
			System.out.print("�����ł��B������x�H�@1�cYes�^2�cNo�F");
			retry = scn.nextInt();
		} while (retry == 1);	
	}
}
