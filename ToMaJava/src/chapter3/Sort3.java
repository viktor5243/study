package chapter3;
import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�ϐ�a:");
		int a = scn.nextInt();
		System.out.print("�ϐ�b:");
		int b = scn.nextInt();
		System.out.print("�ϐ�c:");
		int c = scn.nextInt();
		
		if(a > b) {
			int t = a; a = b; b = t;		
		}
		if(b > c) {
			int t = b; b = c; c = t;
		}
		if(a > b) {
			int t = a; a = b; b = t;
		}
		System.out.println("a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");
		System.out.println("�ϐ�c��" + c + "�ł��B");
	}
}
