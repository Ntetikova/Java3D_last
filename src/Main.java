public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double pc = 9.99; // процентная ставка
        double period = 12; // период
        double sum = 1_000_000; //сумма кредита
        double pv = service.calculate(pc, period, sum);
        System.out.println("На сроке 12 месяцев ежемесячный платёж составит: " + pv + " руб");

        System.out.println();
        double a_pc = 9.99; // процентная ставка
        double a_period = 24; // период
        double a_sum = 1_000_000; //сумма кредита
        double a_pv = service.calculate_a(a_pc, a_period, a_sum);
        System.out.println("На сроке 24 месяца ежемесячный платёж составит: " + a_pv + " руб");

        System.out.println();
        double b_pc = 9.99; // процентная ставка
        double b_period = 36; // период
        double b_sum = 1_000_000; //сумма кредита
        double b_pv = service.calculate_b(b_pc, b_period, b_sum);
        System.out.println("На сроке 36 месяцев ежемесячный платёж составит: " + b_pv + " руб");
    }
}