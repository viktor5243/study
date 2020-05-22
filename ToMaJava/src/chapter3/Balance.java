package chapter3;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("変数a：");
		int a = scn.nextInt();
		System.out.print("変数b：");
		int b = scn.nextInt();
		
		if(a>b)
			System.out.println("aの方が大きいです。");
		else if(a<b)
			System.out.println("bの方が大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}
}
