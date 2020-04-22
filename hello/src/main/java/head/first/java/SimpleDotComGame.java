package head.first.java;

class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGusses = 0;
        GameHelper helper = new GameHelper();
	
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
	
        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGusses++;
		
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took" + numOfGusses + "gusses");
            }//if文の終了
        }//while文の終了
    }//mainの終了
}
