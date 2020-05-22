package chapter3;
import java.util.Scanner;

public class grade1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("点数：");
		int n = scn.nextInt();
		
		if(0>n || n>100)
			System.out.println("不正な点数です。");
		else if(n<60)
			System.out.println("不可");
		else if(n<70)
			System.out.println("可");
		else if(n < 80)
			System.out.println("良");
		else
			System.out.println("優");
	}
}
