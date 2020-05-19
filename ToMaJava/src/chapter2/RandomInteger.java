//整数の乱数を生成して表示
package chapter2;
import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n1 = 1 + rand.nextInt(9); //1桁の正の整数
		int n2 = -1 - rand.nextInt(9); //1桁の負の整数
		int n3 = 10 + rand.nextInt(90); //2桁の正の整数
		
		System.out.println("3個の乱数を生成しました。");
		System.out.println("1桁の正の整数：" +n1);
		System.out.println("1桁の負の整数：" +n2);
		System.out.println("2桁の正の整数：" +n3);
	}
}
