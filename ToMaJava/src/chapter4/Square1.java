package chapter4;
import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("nの値：");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i + "の2乗は" + i * i);
	}
}
