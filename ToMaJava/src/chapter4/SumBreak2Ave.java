package chapter4;
import java.util.Scanner;

public class SumBreak2Ave {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = scn.nextInt(); //加算する個数
		
		int sum = 0;
		int i;
		for(i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = scn.nextInt();
			if(sum + t > 1000) {
				System.out.println("合計が1000を超えました。");
				System.out.println("最後の数値は無視します。");
				break; //for文から抜ける。下の「sum += t;」にはいかない。
			}
			sum += t;
		}
		System.out.println("合計は" + sum + "です。");
		if(i != 0) {
			System.out.println("平均は" + sum/i + "です。");
		}
	}
}
