package chapter4;
import java.util.Scanner;
import java.util.Random;

public class Kazuate {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		
		final int MAX_NO = 6;       //�ő���͐�
		int leftNo = MAX_NO;        //�c���
		int no = rand.nextInt(100); //���Ă�ׂ����F0�`99�̗����Ƃ��Đ���
		
		System.out.println("�����ăQ�[���J�n�I�I");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		
		int x;  //�v���[���[�����͂�����
		do {
			System.out.print("�c��" + leftNo-- + "��B�������ȁF");
			x = scn.nextInt();
			if(no < x)
				System.out.println("�����Ə����Ȑ�����B");
			else if (no > x)
				System.out.println("�����Ƒ傫�Ȑ�����B");
		} while (no != x && leftNo > 0);
		if(x == no)
			System.out.println(MAX_NO - leftNo + "��œ�����܂����ˁB");
		else
			System.out.println("�c�O�B������" + no + "�ł����B");
	}
}
