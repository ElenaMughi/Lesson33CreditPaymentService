public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditsum = 1_000_000; //сумма кредита
        float percent = ((float) 9.99) / 1200; //процент (коэфф.) по кредиту
        int periodinyear = 1; //количество лет
        int periodinyear2 = 2; //количество лет2
        int periodinyear3 = 3; //количество лет3

        int payment = service.calculate(creditsum, percent, (periodinyear * 12));
        System.out.println("Ежемесячный платеж на " + periodinyear + "г. " + payment + " руб");

        int payment2 = service.calculate(creditsum, percent, (periodinyear2 * 12));
        System.out.println("Ежемесячный платеж на " + periodinyear2 + "г. " + payment2 + " руб");

        int payment3 = service.calculate(creditsum, percent, (periodinyear3 * 12));
        System.out.println("Ежемесячный платеж на " + periodinyear3 + "г. " + payment3 + " руб");

    }
}
