package chapter4;
import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�J�E���g�A�b�v���܂��B");
		
		int x;
		do {
		System.out.print("���̐����l�F");
		x = scn.nextInt();
		}while(x <= 0); //�����ǂ����̔���B
		
		for(int i = 0; x >= i; i++)
			System.out.println(i);
	}
}
