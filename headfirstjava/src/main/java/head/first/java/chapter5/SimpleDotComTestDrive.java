package main.java.head.first.java.chapter5;

//���R�[�h�Ƃ������̂炵���H�H���̂܂܂ł͎��s�ł��Ȃ��B
public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
	}
}
