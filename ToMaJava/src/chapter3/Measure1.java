package chapter3;
import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�ϐ�A�F");
		int n = scn.nextInt();
		
		System.out.print("�ϐ�B�F");
		int m = scn.nextInt();
		
		if(n%m == 0) {
			System.out.println("B��A�̖񐔂ł��B");
		}else {
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		}
	}
}
