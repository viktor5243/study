//�����̗����𐶐����ĕ\��
package chapter2;
import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double n1 = rand.nextDouble();
		double n2 = rand.nextDouble() * 10;
		double n3 = -1 + rand.nextDouble();
		
		System.out.println("3�̗����𐶐����܂����B");
		System.out.println("0.0�ȏ�1.0�����F" +n1);
		System.out.println("0.0�ȏ�10.0�����F" +n2);
		System.out.println("-1.0�ȏ�1.0�����F" +n3);
	}
}
