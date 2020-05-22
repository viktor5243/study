package chapter3;
import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("整数値：");
		int n = scn.nextInt();
		
		if(n>0)
			if(n%3 == 0)
				System.out.println("その値は3で割り切れます。");
			else
				System.out.println("その値を3で割った余りは"+ n%3 +"です。");
		else
			System.out.println("正でない値が入力されました。");
	}
}
