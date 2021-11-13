public class CreditPaymentService {
    public int calculate(int CreditSum, float Percent, int PeriodInMonth) {

        double Х = Math.pow(1 + Percent, PeriodInMonth);
        double Coefficient = Percent * Х / (Х - 1);
        double MonthlyPaiment = Coefficient * CreditSum;

        return (int) MonthlyPaiment;
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

