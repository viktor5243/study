package chapter4;
import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�G�߂����߂܂��B");
		
		int retry; //������x�H
		do {
			int month;
			do {
				System.out.print("�����ł����F");
				month = scn.nextInt();
			} while (month < 1 || 12 < month);
		
			if (3 <= month && month <= 5) {
				System.out.println("����͏t�ł��B");
			} else if (6 <= month && month <= 8) {
				System.out.println("����͉Ăł��B");
			} else if (9 <= month && month <= 11) {
				System.out.println("����͏H�ł��B");
			} else if (month == 12 || month == 1 || month == 2) {
				System.out.println("����͓~�ł��B");
			}
		
			System.out.print("������x�H�@1�cYes�^0�cNo�F");
			retry = scn.nextInt();
			
		} while(retry == 1);
	}
}
