package chapter3;
import java.util.Scanner;

public class grade1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�_���F");
		int n = scn.nextInt();
		
		if(0>n || n>100)
			System.out.println("�s���ȓ_���ł��B");
		else if(n<60)
			System.out.println("�s��");
		else if(n<70)
			System.out.println("��");
		else if(n < 80)
			System.out.println("��");
		else
			System.out.println("�D");
	}
}
