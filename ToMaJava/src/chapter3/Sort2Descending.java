package chapter3;
import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("変数a：");
		int a = scn.nextInt();
		System.out.print("変数b：");
		int b = scn.nextInt();
		
		if(a < b) {
			int t = a; //aの値を退避
			a = b;
			b = t;
		}
		System.out.println("a≧bとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
	}
}
