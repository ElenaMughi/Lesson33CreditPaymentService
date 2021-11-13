public class CreditPaymentService {
    public int calculate(int creditsum, float percent, int periodinmonth) {

        double x = Math.pow(1 + percent, periodinmonth);
        double coefficient = percent * x / (x - 1);
        double monthlypaiment = coefficient * creditsum;

        return (int) monthlypaiment;
    }
}
//        Формула расчёта суммы ежемесячного платежа при аннуитетной схеме погашения следующая:
//        A = rate * S
//        где А – сумма ежемесячного аннуитетного платежа,
//        rate - коэффициент аннуитета,
//        S - сумма кредита.
//        Сумма кредита известна. А для расчёта rate – коэффициента аннуитета, используется следующая формула
//        rate=(i*(1+i)^n)/((1+i)^n-1)
//        где i - процентная ставка по кредиту в месяц (рассчитывается как годовая, делённая на 12 месяцев),
//                n - количество периодов (месяцев) погашения кредита.

