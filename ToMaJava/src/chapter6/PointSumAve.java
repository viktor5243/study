package chapter6;
import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("人数：");
		int x = scn.nextInt();    //人数
		int []y = new int[x];
		int sum = 0;
		System.out.println("点数を入力せよ。");
		
		for(int i = 0; i < x; i++) {
			System.out.print((i +1) + "番の点数：");
			y[i] = scn.nextInt();   //点数
			sum += y[i];
		}
		
		int max = y[0];
		int min = y[0];
		for(int i = 1; i < x; i++) {
			if(y[i] < min)
				min = y[i];
			if(y[i] > max)
				max = y[i];
		}
		System.out.println("合計点は" + sum + "です。");
		System.out.println("平均点は" + (double)sum/x + "です。");
		System.out.println("最高点は" + max + "です。");
		System.out.println("最低点は" + min + "です。");
	}
}
