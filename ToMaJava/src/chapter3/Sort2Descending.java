package chapter3;
import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�ϐ�a�F");
		int a = scn.nextInt();
		System.out.print("�ϐ�b�F");
		int b = scn.nextInt();
		
		if(a < b) {
			int t = a; //a�̒l��ޔ�
			a = b;
			b = t;
		}
		System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");
	}
}
