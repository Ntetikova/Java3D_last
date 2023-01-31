public class CreditPaymentService {
    public double calculate(double pc, double period, double sum) {
        double pc1 = pc / period / 100;
        double pc2 = pc1 * Math.pow(1 + pc1, period);
        double pc3 = pc2 / ((Math.pow((1 + pc1), period)) - 1);
        double pv = pc3 * sum;

        return pv;
    }

    public double calculate_a(double a_pc, double a_period, double a_sum) {
        double a_pc1 = a_pc / a_period / 100;
        double a_pc2 = a_pc1 * Math.pow(1 + a_pc1, a_period);
        double a_pc3 = a_pc2 / ((Math.pow((1 + a_pc1), a_period)) - 1);
        double a_pv = a_pc3 * a_sum;

        return a_pv;
    }

    public double calculate_b(double b_pc, double b_period, double b_sum) {
        double b_pc1 = b_pc / b_period / 100;
        double b_pc2 = b_pc1 * Math.pow(1 + b_pc1, b_period);
        double b_pc3 = b_pc2 / ((Math.pow((1 + b_pc1), b_period)) - 1);
        double b_pv = b_pc3 * b_sum;

        return b_pv;
    }
}
