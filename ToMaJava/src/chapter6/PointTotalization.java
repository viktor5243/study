package chapter6;
import java.util.Scanner;

public class PointTotalization {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		final int NINZU = 6;
		int[][] point = new int[NINZU][2];
		int[] sumStudent = new int[NINZU];
		int[] sumSubject = new int[2];
		
		System.out.printf("%d�l�̍���E���w�̓_������͂���\n", NINZU);
		
		for(int i = 0; i < NINZU; i++) {
			System.out.printf("%2d�ԁc����F", i + 1);
			point[i][0] = scn.nextInt();
			System.out.print("           ���w�F");
			point[i][1] = scn.nextInt();
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}
		
		System.out.println("No.   ����@���w�@����");
		for(int i = 0; i < NINZU; i++) 
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1],
					(double)sumStudent[i] /2);
		System.out.printf("����%6.1f%6.1f\n", (double)sumSubject[0] / NINZU,
				(double)sumSubject[1] / NINZU);
	}
}
