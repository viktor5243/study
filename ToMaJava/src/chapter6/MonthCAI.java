package chapter6;
import java.util.Scanner;
import java.util.Random;

public class MonthCAI {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		String [] monthString = {"January", "February", "March", "April", "May", "Jun", "July",
				"August", "September", "October", "November", "December"};
		
		System.out.println("�p��̌�������͂��ĉ������B");
		System.out.println("�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
		int retry; //������x
		int last = -1; //�O��̌�
		do {
			int month;
			do {
				month = rand.nextInt(11);
			} while (month == last);
			last = month;
			
			while(true) {
				System.out.print((month + 1) + "���F");
				String answer = scn.next();
				
				if(answer.equals(monthString[month])) 
					break;
				else
					System.out.println("�Ⴂ�܂��B");	
			}
			System.out.print("�����ł��B������x�H�@1�cYes�^2�cNo�F");
			retry = scn.nextInt();
		} while (retry == 1);
	}
}
