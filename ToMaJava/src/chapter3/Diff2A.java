package chapter3;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����a�F");
		int a = scn.nextInt();
		System.out.print("����b�F");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("�����̍���" +diff +"�ł��B");
	}
}
