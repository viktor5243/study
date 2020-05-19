//実数の乱数を生成して表示
package chapter2;
import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double n1 = rand.nextDouble();
		double n2 = rand.nextDouble() * 10;
		double n3 = -1 + rand.nextDouble();
		
		System.out.println("3個の乱数を生成しました。");
		System.out.println("0.0以上1.0未満：" +n1);
		System.out.println("0.0以上10.0未満：" +n2);
		System.out.println("-1.0以上1.0未満：" +n3);
	}
}
