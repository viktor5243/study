package chapter4;
import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("カウントダウンします。");
		
		int x;
		do {
		System.out.print("正の整数値：");
		x = scn.nextInt();
		}while(x <= 0); //正かどうかの判定。
		
		while(x >= 0)
			System.out.println(--x);
		System.out.println("nの値は" + x + "になりました。");
	}
}
