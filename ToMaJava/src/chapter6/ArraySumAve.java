package chapter6;
import java.util.Scanner;

public class ArraySumAve {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数：");
		int x = scn.nextInt();
		double [] a = new double[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextDouble();
		}
		double sum = 0;
		for(double i : a)
			sum += i;
		
		System.out.println("全要素の合計は" + sum + "です。");
		System.out.println("全要素の平均は" + sum / x + "です。");
	}
}
