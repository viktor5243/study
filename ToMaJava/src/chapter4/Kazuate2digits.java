package chapter4;
import java.util.Scanner;
import java.util.Random;

public class Kazuate2digits {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		int x = 10 + rand.nextInt(90);
		
		System.out.println("数当てゲーム開始！！");
		System.out.println("10～99の数を当ててください。");
		
		int answer;
		do {
			System.out.print("いくつかな：");
			answer = scn.nextInt();
			if(x < answer)
				System.out.println("もっと小さな数だよ。");
			else if (x > answer)
				System.out.println("もっと大きな数だよ。");
		} while (x != answer);
		System.out.println("正解です。");
	}
}
