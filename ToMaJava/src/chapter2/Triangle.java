package chapter2;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		System.out.print("��ӁF");
		double width = scn.nextDouble();
		
		System.out.print("�����F");
		double height = scn.nextDouble();
		
		System.out.println("�ʐς�"+ (width * height)/2 +"�ł��B");
		
	}
}
