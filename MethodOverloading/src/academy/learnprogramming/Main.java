package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeteres = calcFeetAndINchesToCentimeteres(6, 13);
        if(centimeteres <0.0) {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndINchesToCentimeteres(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points ");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndINchesToCentimeteres(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndINchesToCentimeteres(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndINchesToCentimeteres(feet, remainingInches);
    }

}


//    Method Overloading - Use same method name in different places with different parameters
//        Create a unique method signature, which is the method name and its parameters