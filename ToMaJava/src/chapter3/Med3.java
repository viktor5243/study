package chapter3;
import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("����a�F");
		int a = scn.nextInt();
		System.out.print("����b�F");
		int b = scn.nextInt();
		System.out.print("����c�F");
		int c = scn.nextInt();
		
		int med;
		if(a >= b)
			if(b >= c)
				med = b;
			else if (a <= c)
				med = a;
			else	
				med = c;
		else if (a > c)
			med = a;
		else if (b>c)
			med = c;
		else
			med = b;
		System.out.println("�����l��" + med + "�ł��B");
	}
}
