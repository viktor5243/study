package chapter4;
import java.util.Scanner;

public class SumBreak2Ave {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = scn.nextInt(); //���Z�����
		
		int sum = 0;
		int i;
		for(i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = scn.nextInt();
			if(sum + t > 1000) {
				System.out.println("���v��1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break; //for�����甲����B���́usum += t;�v�ɂ͂����Ȃ��B
			}
			sum += t;
		}
		System.out.println("���v��" + sum + "�ł��B");
		if(i != 0) {
			System.out.println("���ς�" + sum/i + "�ł��B");
		}
	}
}
