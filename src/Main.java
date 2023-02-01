public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        /*
        percentageRate - процентная ставка
        creditPeriod - срок кредита
        creditSum - сумма кредита
         */
        System.out.println();
        double monthlyPaymentForOneYear = service.calculate(9.99, 12, 1_000_000);
        System.out.println("На сроке 12 месяцев ежемесячный платёж составит: " + monthlyPaymentForOneYear + " руб");

        System.out.println();
        double monthlyPaymentForTwoYears = service.calculate(9.99, 24, 1_000_000);
        System.out.println("На сроке 24 месяца ежемесячный платёж составит: " + monthlyPaymentForTwoYears + " руб");

        System.out.println();
        double monthlyPaymentForThreeYears = service.calculate(9.99, 36, 1_000_000);
        System.out.println("На сроке 36 месяцев ежемесячный платёж составит: " + monthlyPaymentForThreeYears + " руб");

    }
}