package chapter4;
import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		
		int x;
		do {
		System.out.print("���̐����l�F");
		x = scn.nextInt();
		}while(x <= 0); //�����ǂ����̔���B
		
		while(x >= 0)
			System.out.println(--x);
		System.out.println("n�̒l��" + x + "�ɂȂ�܂����B");
	}
}
