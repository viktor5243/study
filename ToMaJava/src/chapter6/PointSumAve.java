package chapter6;
import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�l���F");
		int x = scn.nextInt();    //�l��
		int []y = new int[x];
		int sum = 0;
		System.out.println("�_������͂���B");
		
		for(int i = 0; i < x; i++) {
			System.out.print((i +1) + "�Ԃ̓_���F");
			y[i] = scn.nextInt();   //�_��
			sum += y[i];
		}
		
		int max = y[0];
		int min = y[0];
		for(int i = 1; i < x; i++) {
			if(y[i] < min)
				min = y[i];
			if(y[i] > max)
				max = y[i];
		}
		System.out.println("���v�_��" + sum + "�ł��B");
		System.out.println("���ϓ_��" + (double)sum/x + "�ł��B");
		System.out.println("�ō��_��" + max + "�ł��B");
		System.out.println("�Œ�_��" + min + "�ł��B");
	}
}
