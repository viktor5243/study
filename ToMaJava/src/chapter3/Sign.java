package chapter3;
import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = scn.nextInt();
		
		if(n>0) 
			System.out.println("���̒l�͐��ł��B");
		else if(n==0) 
			System.out.println("���̒l��0�ł��B");
		else
			System.out.println("���̒l�͕��ł��B");
	}
}
