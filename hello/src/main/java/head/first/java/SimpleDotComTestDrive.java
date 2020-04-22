package head.first.java;

//仮コードというものらしい？？そのままでは実行できない。
public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
	}
}
