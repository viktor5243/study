package chapter4;
import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int retry; //������x�H
		
		do {
			System.out.print("�����l�F");
			int n = scn.nextInt();
			
			if(n > 0) 
				System.out.println("���̒l�͐��ł��B");
			else if(n < 0)
				System.out.println("���̒l�͕��ł��B");
			else
				System.out.println("���̒l��0�ł��B");
		
			System.out.print("������x�H 1�cYes�^0�cNo�F");
		retry = scn.nextInt();
		
		} while (retry == 1);
	}
}
