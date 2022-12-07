public class LearningForLoops {
    public static void main (String [] args ) {
        //System.out.println("10,000 cedis at 7.5% interest = 10,000 + " + calculateInterest(10000.0, 7.5));

        for (double i=7.5; i>2.6; i-=1.23) {
            double interest = calculateInterest(10000, i);
            System.out.println("Interest on 10,000 at " + String.format("%2f", i) + "% is = " + String.format("%.2f", interest));
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
