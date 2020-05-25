package chapter4;
import java.util.Scanner;
import java.util.Random;

public class Kazuate {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		
		final int MAX_NO = 6;       //最大入力数
		int leftNo = MAX_NO;        //残り回数
		int no = rand.nextInt(100); //当てるべき数：0～99の乱数として生成
		
		System.out.println("数当てゲーム開始！！");
		System.out.println("0～99の数を当ててください。");
		
		int x;  //プレーヤーが入力した数
		do {
			System.out.print("残り" + leftNo-- + "回。いくつかな：");
			x = scn.nextInt();
			if(no < x)
				System.out.println("もっと小さな数だよ。");
			else if (no > x)
				System.out.println("もっと大きな数だよ。");
		} while (no != x && leftNo > 0);
		if(x == no)
			System.out.println(MAX_NO - leftNo + "回で当たりましたね。");
		else
			System.out.println("残念。正解は" + no + "でした。");
	}
}
