package chapter6;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = scn.nextInt();
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			int j;
			do {
				j = 0;
				a[i] = 1 + rand.nextInt(10);
				for( ; j < i; j++)
					if(a[j] == a[i]) break; //“¯‚¶‚à‚Ì‚ª‚ ‚Á‚½“_‚Å‚â‚è’¼‚µ
			}while(j < i);
		}
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}
}
