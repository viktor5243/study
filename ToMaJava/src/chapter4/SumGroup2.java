//�ǂݍ��񂾐����̃O���[�v�����Z�i����5�~10�O���[�v�j
package chapter4;
import java.util.Scanner;

public class SumGroup2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		int total = 0; //�S�O���[�v�̍��v
	Outer:
		for(int i = 1; i <=10; i++) {
			System.out.println("����" + i + "�O���[�v");
			
			for(int j = 0; j < 5; j++) {
				System.out.print("�����F");
				int t = scn.nextInt();
				if (t == 99999) 
					break Outer;
				else if (t == 88888)
					continue Outer;
				total += t;
			}
		}
		System.out.println("\n���v��" + total + "�ł��B");
	}
}
