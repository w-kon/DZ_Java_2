public class Main {
    public static void main(String[] args) {
        int score = 430;
        int bonus_price = 100;
        int topping_up = 2200;
        int bonus_score = topping_up / bonus_price;
        System.out.println("Итого баланс " + (score + topping_up + bonus_score) + " руб.");
        System.out.println("Бонусов зачислено " + bonus_score + " руб.");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}