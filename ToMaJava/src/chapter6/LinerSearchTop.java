package chapter6;
import java.util.Scanner;

public class LinerSearchTop {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数：");
		int n = scn.nextInt(); //要素数
		int []a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextInt();	
		}
		System.out.print("探す数値：");
		int key = scn.nextInt();
		
		int j;
		for(j = 0; j < n; j++)
			if(a[j] == key)
				break;
		if(j < n)
			System.out.println("それはa[" + j + "]にあります。" );
		else
			System.out.println("それはありません。" );
	}
}
