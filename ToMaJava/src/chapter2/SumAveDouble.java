package chapter2;
import java.util.Scanner;

public class SumAveDouble {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = scn.nextDouble();
		
		System.out.print("Yの値：");
		double y = scn.nextDouble();
		
		System.out.println("合計は" +(x+y));
		System.out.println("平均は" +(x+y)/2);
	}
	
	
	
}
