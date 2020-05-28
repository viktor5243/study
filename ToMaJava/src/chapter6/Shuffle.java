package chapter6;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数：");
		int n = scn.nextInt();
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = scn.nextInt();
		}
		
		for(int i = n -1; i > 0; i--) {
			int j = rand.nextInt(i + 1); //ランダムな要素、これでランダムにかき混ぜることになる。
			if(i != j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		System.out.println("要素をかき混ぜました。");
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}
}
