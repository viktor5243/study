package chapter6;
import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[][] a = new int[4][3]; //4行3列の行列
		int[][] b = new int[3][4]; //3行4列の行列
		int[][] c = new int[4][4]; //aとbの積を格納する行列
		
		System.out.println("行列aの要素の値を入力せよ。");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("a[" + i + "][" + j + "]：");
				a[i][j] = scn.nextInt();
			}
		}
		System.out.println("行列bの要素の値を入力せよ。");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("b[" + i + "][" + j + "]：");
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
		
		System.out.println("行列aとbの積");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) 
				System.out.printf("%5d", c[i][j]);
			System.out.println();
			
		}
	}
}
