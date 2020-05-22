package chapter3;
import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("êÆêîAÅF");
		int a = scn.nextInt();
		System.out.print("êÆêîBÅF");
		int b = scn.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		System.out.println("ÇªÇÍÇÁÇÃç∑ÇÕ" + (diff<=10 ? "10à»â∫" : "11à»è„") + "Ç≈Ç∑ÅB");
	}
}
