package chapter3;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�ϐ�a�F");
		int a = scn.nextInt();
		System.out.print("�ϐ�b�F");
		int b = scn.nextInt();
		
		if(a>b)
			System.out.println("a�̕����傫���ł��B");
		else if(a<b)
			System.out.println("b�̕����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
	}
}
