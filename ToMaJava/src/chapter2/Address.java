//住所を読み込んで反復表示
package chapter2;
import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("住所：");
		String address = scn.nextLine(); //住所に空白が含まれる可能性があるため、nextLine()を使用。
		
		System.out.println("お住まいは" + address + "ですね。");
		
	}
}
