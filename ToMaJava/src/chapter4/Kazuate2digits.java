package chapter4;
import java.util.Scanner;
import java.util.Random;

public class Kazuate2digits {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		int x = 10 + rand.nextInt(90);
		
		System.out.println("�����ăQ�[���J�n�I�I");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int answer;
		do {
			System.out.print("�������ȁF");
			answer = scn.nextInt();
			if(x < answer)
				System.out.println("�����Ə����Ȑ�����B");
			else if (x > answer)
				System.out.println("�����Ƒ傫�Ȑ�����B");
		} while (x != answer);
		System.out.println("�����ł��B");
	}
}
