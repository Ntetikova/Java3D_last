public class CreditPaymentService {
    public double calculate(double percentageRate, double creditPeriod, double creditSum) {
        double pc1 = percentageRate / creditPeriod / 100;
        double pc2 = pc1 * Math.pow(1 + pc1, creditPeriod);
        double pc3 = pc2 / ((Math.pow((1 + pc1), creditPeriod)) - 1);
        double initialPayment = pc3 * creditSum;

        return initialPayment;
    }
}
