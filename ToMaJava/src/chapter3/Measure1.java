package chapter3;
import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("変数A：");
		int n = scn.nextInt();
		
		System.out.print("変数B：");
		int m = scn.nextInt();
		
		if(n%m == 0) {
			System.out.println("BはAの約数です。");
		}else {
			System.out.println("BはAの約数ではありません。");
		}
	}
}
