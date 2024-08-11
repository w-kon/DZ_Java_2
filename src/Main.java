public class Main {
    public static void main(String[] args) {
        int score = 430;
        int bonusPrice = 100;
        int toppingUp = 2200;
        int bonusScore = toppingUp / bonusPrice;
        System.out.println("Итого баланс " + (score + toppingUp + bonusScore) + " руб.");
        System.out.println("Бонусов зачислено " + bonusScore + " руб.");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}