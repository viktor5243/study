package chapter3;
import java.util.Scanner;

public class Absolute1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�����l�F");
		int n = scn.nextInt();
		
		if(n>=0) {
			System.out.println("���̐�Βl��" +n +"�ł��B");
		}else {
			System.out.println("���̐�Βl��" +(-n) +"�ł��B");
		}	
	}
}
