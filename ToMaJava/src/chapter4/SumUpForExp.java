package chapter4;
import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1からnまでの和を求めます。");
		int x = 0;
		do {
			System.out.print("nの値：");
			x = scn.nextInt();
		}while(x <= 0);
		
		int sum= 0;
		for(int i = 0; i < x; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.print(x + "=");
		sum += x;
		System.out.println(sum);
	}
}
