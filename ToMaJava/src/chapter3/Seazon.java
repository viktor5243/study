package chapter3;
import java.util.Scanner;

public class Seazon {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("�����ł����F");
		int month = scn.nextInt();
		
		switch(month){
			case 3:
			case 4:
			case 5: System.out.println("�t"); break;
			case 6:
			case 7:
			case 8: System.out.println("��"); break;
			case 9:
			case 10:
			case 11: System.out.println("�H"); break;
			case 12:
			case 1:
			case 2: System.out.println("�~"); break;
			default: System.out.println("����Ȍ��͂���܂���B"); break;
		}
	}
}
