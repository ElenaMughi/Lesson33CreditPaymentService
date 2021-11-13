public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int CreditSum = 1_000_000; //сумма кредита
        float Percent = ((float) 9.99) / 1200; //процент (коэфф.) по кредиту
        int PeriodInYear = 1; //количество лет
        int PeriodInYear2 = 2; //количество лет2
        int PeriodInYear3 = 3; //количество лет3

        int Payment = service.calculate(CreditSum, Percent, (PeriodInYear * 12));
        System.out.println("Ежемесячный платеж на " + PeriodInYear + "г. " + Payment + " руб");

        int Payment2 = service.calculate(CreditSum, Percent, (PeriodInYear2 * 12));
        System.out.println("Ежемесячный платеж на " + PeriodInYear2 + "г. " + Payment2 + " руб");

        int Payment3 = service.calculate(CreditSum, Percent, (PeriodInYear3 * 12));
        System.out.println("Ежемесячный платеж на " + PeriodInYear3 + "г. " + Payment3 + " руб");

    }
}
