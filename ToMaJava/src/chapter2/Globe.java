package chapter2;
import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.println("球の表面積と体積を求めます。");
		System.out.print("半径：");
		double r = scn.nextDouble();
		
		System.out.println("表面積は" + (4*PI*r*r) + "です。");
		System.out.println("体積は" + (4*PI*r*r*r)/3 + "です。");
		
	}
}
