package chapter4;
import java.util.Scanner;

public class SumContinueAve {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = scn.nextInt(); //加算する個数
		
		int sum = 0;   //合計値
		int count = 0; //非負の値の数
		int i;
		for(i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = scn.nextInt();
			if(t < 0) {
				System.out.println("負の数は加算しません。");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("合計は" + sum + "です。");
		if(count != 0) {
			System.out.println("平均は" + sum/count + "です。");
		}
	}
}
