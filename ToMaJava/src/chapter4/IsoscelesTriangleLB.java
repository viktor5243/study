package chapter4;
import java.util.Scanner;

public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�������p�̓񓙕ӎO�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
