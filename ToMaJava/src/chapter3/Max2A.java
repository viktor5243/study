package chapter3;
import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����a�F");
		Double n = scn.nextDouble();
		
		System.out.print("����b�F");
		Double m = scn.nextDouble();
		
		Double max = n>m ? n:m;
		
		System.out.println("�傫�����̒l��" +max +"�ł��B");

	}
}
