package chapter2;
import java.util.Scanner;
import java.util.Random;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		int x = scn.nextInt();
		
		System.out.println("その値±5の乱数を生成しました。");
		System.out.println("値は" + (x-5 + rand.nextInt(11)) + "です。");
	}
}
