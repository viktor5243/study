//�����̗����𐶐����ĕ\��
package chapter2;
import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n1 = 1 + rand.nextInt(9); //1���̐��̐���
		int n2 = -1 - rand.nextInt(9); //1���̕��̐���
		int n3 = 10 + rand.nextInt(90); //2���̐��̐���
		
		System.out.println("3�̗����𐶐����܂����B");
		System.out.println("1���̐��̐����F" +n1);
		System.out.println("1���̕��̐����F" +n2);
		System.out.println("2���̐��̐����F" +n3);
	}
}
