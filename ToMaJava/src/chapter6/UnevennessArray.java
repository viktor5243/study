package chapter6;
import java.util.Scanner;

public class UnevennessArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�ʉ���2�����z������܂��B");
		System.out.print("�s���F");
		int height = scn.nextInt();
		int[][] c = new int[height][];
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(i + "�s�ڂ̗񐔁F");
			int width = scn.nextInt();
			c[i] = new int[width];
		}
		System.out.println("�e�v�f�̒l����͂���B");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.printf("c[%d][%d]�F", i, j);
				c[i][j] = scn.nextInt();
			}
		}
		System.out.println("�z�񂃂̊e�v�f�̒l�͎��̂悤�ɂȂ��Ă��܂��B");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) 
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
	}
}
