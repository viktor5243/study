package chapter6;
import java.util.Scanner;

public class LinerSearchTop {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�v�f���F");
		int n = scn.nextInt(); //�v�f��
		int []a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextInt();	
		}
		System.out.print("�T�����l�F");
		int key = scn.nextInt();
		
		int j;
		for(j = 0; j < n; j++)
			if(a[j] == key)
				break;
		if(j < n)
			System.out.println("�����a[" + j + "]�ɂ���܂��B" );
		else
			System.out.println("����͂���܂���B" );
	}
}
