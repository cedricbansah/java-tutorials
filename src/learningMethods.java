public class learningMethods {


    static int highScorePosition; // high score position declared globally so multiple methods can access it.
    public static void main(String[] args) {

        double myHeightInCM = calcFeetAndInchesToCentimeters(6,3);
        System.out.println("My height in centimeters = " + myHeightInCM);

        double myHeightInCm = calcFeetAndInchesToCentimeters(76.4);
        System.out.println("My height in centimeters = " + myHeightInCm);

        /*

        calculateHighScorePosition(1500);
        displayHighScorePosition("Ben", highScorePosition);

        calculateHighScorePosition(900);
        displayHighScorePosition("Anna", highScorePosition);

        calculateHighScorePosition(400);
        displayHighScorePosition("Jean", highScorePosition);

        calculateHighScorePosition(50);
        displayHighScorePosition("Cedric", highScorePosition);
         */




    }



  /*
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
            return finalScore;
        } else
            return -1;
    }


    //method to calculate a player's position on the leaderboard given their high score
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            highScorePosition = 1;
        }  // if player high score is greater than 1000 points they are ranked number 1 on the leaderboard

        else if (playerScore >= 500 && playerScore < 1000) {
            highScorePosition = 2;
        }  // if player high score is between 500 and 1000 points they are ranked number 2 on the leaderboard

        else if (playerScore >= 100 && playerScore < 500) {
            highScorePosition = 3;
        } // if player high score is between 100 and 500 points they are ranked number 3 on the leaderboard

        else {
            highScorePosition = 4;
        } // if player high score is less than 100 they are ranked number 4 on the leaderboard

        return highScorePosition;
    }

    // method to display a player's position on the leaderboard
    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName + " ranked " + highScorePosition + " on the leaderboard");
    }

   */


    // method to convert feet and inches to centimeters
    public static double calcFeetAndInchesToCentimeters(int feet, double inches) { // method declared with feet and inches parameters
        // validating the parameters passed in the method
        if (feet >= 0 && inches >=0 && inches <=12){

            // converting from feet to inches to obtain a total inches value
            double fullInches = (feet * 12) + inches;

            // converting from inches to centimeters
            return (fullInches * 2.54);
        } else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0){
            return (inches * 2.54);
        } else
            return -1;
    }
}