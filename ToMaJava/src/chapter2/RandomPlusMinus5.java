package chapter2;
import java.util.Scanner;
import java.util.Random;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�����l�F");
		int x = scn.nextInt();
		
		System.out.println("���̒l�}5�̗����𐶐����܂����B");
		System.out.println("�l��" + (x-5 + rand.nextInt(11)) + "�ł��B");
	}
}
