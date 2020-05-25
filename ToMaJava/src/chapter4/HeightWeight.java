package chapter4;
import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("何cmから：");
		int hMin = scn.nextInt();		
		System.out.print("何cmまで：");
		int hMax = scn.nextInt();
		System.out.print("何cmごと：");
		int step = scn.nextInt();
		
		System.out.println("身長　標準体重");
		System.out.println("--------------");
		for(int i = hMin ; i <= hMax; i += step ) {
			System.out.println(i + " " + (i -100) *0.9);
		}
	}
}
