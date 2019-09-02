package task_04_clases;

class CashMachine {
    private final int ruble_20 = 20;
    private final int ruble_50 = 50;
    private final int ruble_100 = 100;
    private int numOfRubles_20;
    private int numOfRubles_50;
    private int numOfRubles_100;

    CashMachine(int numOfRubles_20, int numOfRubles_50, int numOfRubles_100) {
        this.numOfRubles_20 = numOfRubles_20;
        this.numOfRubles_50 = numOfRubles_50;
        this.numOfRubles_100 = numOfRubles_100;
    }

    public void cashIn(int amount20, int amount50, int amount100) {
        cashIn20(amount20);
        cashIn50(amount50);
        cashIn100(amount100);
    }
    private void cashIn20(int amount) {
        numOfRubles_20 += amount;
    }
    private void cashIn50(int amount) {
        numOfRubles_50 += amount;
    }
    private void cashIn100(int amount) {
        numOfRubles_100 += amount;
    }
    public void sumCash() {
        System.out.println(
                "Остаток в банкомате: \n" +
                        "Купюры номиналом 20р: " + numOfRubles_20 + "\n" +
                        "Купюры номиналом 50р: " + numOfRubles_50 + "\n" +
                        "Купюры номиналом 100р: " + numOfRubles_100 + "\n" +
                        "Сумма остатка: " + calculateCashSum() + " руб." + "\n");
    }
    private int calculateCashSum() {
        return ruble_20 * numOfRubles_20 + ruble_50 * numOfRubles_50 + ruble_100 * numOfRubles_100;
    }
    private boolean canCashOut(int amount) {
        return amount > calculateCashSum();
    }
    boolean cashOut(int amount) {
        if (canCashOut(amount) || amount < ruble_20) {
            if (canCashOut(amount)) {
                System.err.println("Ошибка! В бакномате не хватает денег, попробуйте ввести сумму еще раз. ");
            }
            if (amount < ruble_20) {
                System.err.println("Ошибка! Минимальная сумма вывода 20 рублей, попроуйте еще раз.");
            }
            return false;
        }
        for (int i = 0; i <= numOfRubles_20; i++) {
            for (int j = 0; j <= numOfRubles_50; j++) {
                for (int x = 0; x <= numOfRubles_100; x++) {
                    if (isAcceptable(i, j, x, amount)) {
                        return cashOut(i, j, x);
                    }
                }
            }
        }
        System.err.println("В банкомате нет подходящих купюр.");
        return false;
    }
    private boolean cashOut(int i, int j, int x) {
        this.numOfRubles_20 = this.numOfRubles_20 - i;
        this.numOfRubles_50 = this.numOfRubles_50 - j;
        this.numOfRubles_100 = this.numOfRubles_100 - x;
        System.out.print("Выведено: " + (x * ruble_100 + j * ruble_50 + i * ruble_20) + "\n" +
                x + " номиналом 100р \n" +
                j + " номиналом 50 рублей \n" +
                i + " номиналом 20 рублей. \n");
        return true;
    }
    private boolean isAcceptable(int numOfRubles_20, int numOfRubles_50, int numOfRubles_100, int amount) {
        int checkedAmount = numOfRubles_20 * ruble_20 + numOfRubles_50 * ruble_50 + numOfRubles_100 * ruble_100;
        return checkedAmount == amount;
    }
}