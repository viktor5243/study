package chapter6;
import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[][] a = new int[4][3]; //4�s3��̍s��
		int[][] b = new int[3][4]; //3�s4��̍s��
		int[][] c = new int[4][4]; //a��b�̐ς��i�[����s��
		
		System.out.println("�s��a�̗v�f�̒l����͂���B");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("a[" + i + "][" + j + "]�F");
				a[i][j] = scn.nextInt();
			}
		}
		System.out.println("�s��b�̗v�f�̒l����͂���B");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("b[" + i + "][" + j + "]�F");
				b[i][j] = scn.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for(int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("�s��a��b�̐�");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) 
				System.out.printf("%5d", c[i][j]);
			System.out.println();
			
		}
	}
}
