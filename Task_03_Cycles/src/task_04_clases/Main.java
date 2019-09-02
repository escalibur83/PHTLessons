package task_04_clases;

public class Main {
    public static void main (String [] args)
    {
        System.out.println("Task - Time:");
        TimeInterval timeInterval = new TimeInterval(1,4,30);
        timeInterval.displayTimeInterval();
        TimeInterval timeSecond = new TimeInterval(3870);
        timeSecond.displaySecond();

        System.out.println("Task - ATM:");

        ATMBank atmBank = new ATMBank();
        atmBank.addMoney(10,10,10);
        atmBank.requestToATM(130);
        atmBank.getMoney(130);

        System.out.println("Task - CashMachine:");
        CashMachine cashMachine = new CashMachine(20,20,20);
        cashMachine.cashOut(130);
    }
}
