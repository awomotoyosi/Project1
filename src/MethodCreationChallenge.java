public class MethodCreationChallenge {

    public static void main(String[] args) {

        int[] playerScoreArray = new int[] {1500,1000,500,100,25};
        String[] playerNameArray = new String[] {"Toyosi","Oreoluwa","Kemi","Damilola","Victoria"};
        for (int i=0, j=0 ;i< playerScoreArray.length; i++,j++) {
                displayHighScorePosition(playerNameArray[j], calculateHighScorePosition(playerScoreArray[i]));
            }
        }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println( playerName + " managed to get into position  "+playerPosition +" on the high score list");


    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
       return 1;

        } else if(playerScore >= 500) {
           return 2;

        } else if (playerScore >= 100) {
           return 3;

        } else {
           return 4;
        }






    }
}