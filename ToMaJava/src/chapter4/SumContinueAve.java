package chapter4;
import java.util.Scanner;

public class SumContinueAve {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = scn.nextInt(); //���Z�����
		
		int sum = 0;   //���v�l
		int count = 0; //�񕉂̒l�̐�
		int i;
		for(i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = scn.nextInt();
			if(t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("���v��" + sum + "�ł��B");
		if(count != 0) {
			System.out.println("���ς�" + sum/count + "�ł��B");
		}
	}
}
