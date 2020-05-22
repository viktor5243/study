package chapter4;
import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("カウントアップします。");
		
		int x;
		do {
		System.out.print("正の整数値：");
		x = scn.nextInt();
		}while(x <= 0); //正かどうかの判定。
		
		for(int i = 0; x >= i; i++)
			System.out.println(i);
	}
}
