package chapter6;
import java.util.Scanner;

public class CopyArrayReverse {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�v�f���F");
		int n = scn.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			b[n-i-1] = a[i];
		}
		System.out.println("a�̗v�f���t����b�ɃR�s�[���܂����B");
		for(int i = 0; i < n; i++)
			System.out.println("[b" + "]=" + b[i]);
	}
}
