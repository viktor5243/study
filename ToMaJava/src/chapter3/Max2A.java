package chapter3;
import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("実数a：");
		Double n = scn.nextDouble();
		
		System.out.print("実数b：");
		Double m = scn.nextDouble();
		
		Double max = n>m ? n:m;
		
		System.out.println("大きい方の値は" +max +"です。");

	}
}
