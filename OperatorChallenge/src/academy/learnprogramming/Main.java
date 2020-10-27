package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstDouble = 20;
        double mySecondDouble = 80;

        double AddMultiplyDoubles = (myFirstDouble + mySecondDouble) * 100.00;
        System.out.println("Sum and Multiplication of the 2 doubles by 100 is: " + AddMultiplyDoubles);

        double RemainderVariable = AddMultiplyDoubles % 40;
        System.out.println("Modulus of the remainder from the previous result and 40 is: " + RemainderVariable);

        boolean RemainderBool = RemainderVariable == 0 ? true : false;
        System.out.println("The Boolean value of RemainderBool is: " + RemainderBool);

        if(!RemainderBool)
            System.out.println("Got some remainder");

    }
}
