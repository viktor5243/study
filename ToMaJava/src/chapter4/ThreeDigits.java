package chapter4;
import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("3���̐��̐����l�F");
			n = scn.nextInt();
			
		} while ((n < 100 || n > 999));
		
		System.out.println(n + "�Ɠ��͂��܂����ˁB");
	}
}
