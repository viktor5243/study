package chapter4;
import java.util.Scanner;

public class SumBreak1Ave {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = scn.nextInt(); //���Z�����
		
		int sum = 0;
		int i;
		for(i = 0; i < n; i++) {
			System.out.print("�����i0�ŏI���j�F");
			int t = scn.nextInt();
			if(t == 0)
				break;
			sum += t;
		}
		System.out.println("���v��" + sum + "�ł��B");
		if(i != 0) {
			System.out.println("���ς�" + sum/i + "�ł��B");
		}
	}
}
