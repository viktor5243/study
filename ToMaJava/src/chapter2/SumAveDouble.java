package chapter2;
import java.util.Scanner;

public class SumAveDouble {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("x�̒l�F");
		double x = scn.nextDouble();
		
		System.out.print("Y�̒l�F");
		double y = scn.nextDouble();
		
		System.out.println("���v��" +(x+y));
		System.out.println("���ς�" +(x+y)/2);
	}
	
	
	
}
