package chapter4;
import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("n�̒l�F");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i + "��2���" + i * i);
	}
}
