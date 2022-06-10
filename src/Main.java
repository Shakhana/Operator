public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUpAmount = 1100;

        int bonus;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }

        int totalBalance = balance + topUpAmount + bonus;
        System.out.println(" Платёж зачислен. Баланс составляет: " + totalBalance + " руб. Ваш бонус составляет:" + bonus + " руб.");

    }
}
