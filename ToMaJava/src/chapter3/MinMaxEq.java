package chapter3;
import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("����a�F");
		int a = scn.nextInt();
		System.out.print("����b�F");
		int b = scn.nextInt();
		
		if(a == b) 
			System.out.println("2�̒l�͓����ł��B");
		else {
			int min, max;
			if(a < b) {
				min = a;
				max = b;
			} else {
				min = b;
			    max = a;
			}
			System.out.println("���������̒l��" + min + "�ł��B");
			System.out.println("�傫�����̒l��" + max + "�ł��B");
		}
	}
}
