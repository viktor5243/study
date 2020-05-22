package chapter3;
import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = scn.nextInt();
		System.out.print("整数b：");
		int b = scn.nextInt();
		System.out.print("整数c：");
		int c = scn.nextInt();
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		System.out.println("最小値は" + min + "です。");
		
	}
}
