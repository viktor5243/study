//姓と名を読み込んで挨拶
package chapter2;
import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("姓：");
		String sei = scn.next();
		
		System.out.print("名：");
		String mei = scn.next();
		
		System.out.println("こんにちは" + sei + mei + "さん。");
		
	}
}
