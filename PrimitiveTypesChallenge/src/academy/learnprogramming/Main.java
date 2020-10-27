package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte bytleValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (bytleValue + shortValue + intValue);
//        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (bytleValue + shortValue + intValue));

//        System.out.println(shortTotal);

    }
}
