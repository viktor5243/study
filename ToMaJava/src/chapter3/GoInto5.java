package chapter3;
import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�����l�F");
		int n = scn.nextInt();
		
		if(n>0)	
			if(n%5 == 0)
				System.out.println("���̒l��5�Ŋ���؂�܂��B");
			else
				System.out.println("���̒l��5�Ŋ���؂�܂���B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");
	}
}
