package chapter3;
import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����A�F");
		int a = scn.nextInt();
		System.out.print("����B�F");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("�����̍���" + (diff<=10 ? "10�ȉ�" : "11�ȏ�") + "�ł��B");
	}
}
