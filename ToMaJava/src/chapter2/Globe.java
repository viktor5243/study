package chapter2;
import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.println("���̕\�ʐςƑ̐ς����߂܂��B");
		System.out.print("���a�F");
		double r = scn.nextDouble();
		
		System.out.println("�\�ʐς�" + (4*PI*r*r) + "�ł��B");
		System.out.println("�̐ς�" + (4*PI*r*r*r)/3 + "�ł��B");
		
	}
}
