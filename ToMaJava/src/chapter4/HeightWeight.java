package chapter4;
import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("��cm����F");
		int hMin = scn.nextInt();		
		System.out.print("��cm�܂ŁF");
		int hMax = scn.nextInt();
		System.out.print("��cm���ƁF");
		int step = scn.nextInt();
		
		System.out.println("�g���@�W���̏d");
		System.out.println("--------------");
		for(int i = hMin ; i <= hMax; i += step ) {
			System.out.println(i + " " + (i -100) *0.9);
		}
	}
}
