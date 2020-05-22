package chapter4;
import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("カウントダウンします。");
		
		int x;
		do {
		System.out.print("正の整数値：");
		x = scn.nextInt();
		}while(x <= 0); //正かどうかの判定。
		
		for( ; x >= 0; x--)
			System.out.println(x);
	}
}
