package chapter3;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("êÆêîaÅF");
		int a = scn.nextInt();
		System.out.print("êÆêîbÅF");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("ÇªÇÍÇÁÇÃç∑ÇÕ" +diff +"Ç≈Ç∑ÅB");
	}
}
