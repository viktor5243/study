package chapter3;
import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����a�F");
		int a = scn.nextInt();
		System.out.print("����b�F");
		int b = scn.nextInt();
		System.out.print("����c�F");
		int c = scn.nextInt();
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		System.out.println("�ŏ��l��" + min + "�ł��B");
		
	}
}
