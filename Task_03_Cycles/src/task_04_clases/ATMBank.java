package task_04_clases;
/*
Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате должен задаваться тремя
свойствами: количеством купюр номиналом 20, 50 и 100. Сделать методы для
добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму
денег,а возвращает булевое значение-успешность выполнения операции.
При снятии денег функция должна распечатывать каким
количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами-количеством купюр каждого номинала.
 */

public class ATMBank {
    static int value20;
    static int value50;
    static int value100;


    public void addMoney(int addValue20, int addValue50, int addValue100) {
        value20 = value20 + addValue20;
        value50 = value50 + addValue50;
        value100 = value100 + addValue100;
    }

    public void requestToATM(int requestMoney) {
        boolean availability;
        int sum = value20 * 20 + value50 * 50 + value100 * 100;
        if (requestMoney % 2 != 0) {
            System.out.println("Data is incorrect");
        }
        else {

            // sum 25
            // 50
            //if(requestMoney <= sum)
            if (sum >= requestMoney)
            {
                availability = true;
                System.out.println("availability = true");
            }
            else
            {
                availability = false;
                System.out.println("Money is cancelled");
            }
        }
    }

    int requestGetMoney; // запрошенная сумма и выдача денег

    public boolean getMoney(int requestForGetMoney) {
        requestGetMoney = requestForGetMoney;
        int[] realValue = {value20, value50, value100};
        int[] value = {20, 50, 100}; // номиналы
        int[] countGet = new int[value.length];
        int i = value.length - 1;

        while (i != -1) {
            countGet[i] = requestForGetMoney / value[i];
            requestForGetMoney %= value[i];
            i--;
        }

        int controlSumm = 0;
        int controlMas[] = {0, 0, 0};
        int fcounter = 1;
        int w = 0;
        int buf = 0;
        //int controlValue = controlMas[w];
        for (w = value.length - 1; w >= 0; w--) {
            for (int q = value.length - fcounter; q >= 0; q--) {

                if (controlSumm < requestGetMoney) {
                    for (int e = 0; controlSumm <= requestGetMoney - value[q]; ) {

                        if (controlMas[1]>=2)
                        {
                            buf = value[q+1];
                            controlMas[1]-=1;
                        }
                        controlSumm += value[q]+buf;
                        controlMas[q] += 1;

                        if (value[w]==value[0])
                        {
                            if (buf != 0)
                            {
                                System.out.println("Номинал: "+ buf + "колличество 1");
                            }
                            buf = 0;
                        }

                    }
                }
                continue;
            }
            if (controlSumm != requestGetMoney) {
                fcounter += 1;
                controlSumm = 0;

                for (int t = 0; controlMas.length>t; t++)
                {
                    controlMas[t] = 0;
                }
                continue;
            }
            System.out.println("Номинал: " + value[0] + " Колличество: " + controlMas[0]);
            System.out.println("К выдаче: " +controlSumm);
        }

// Проверка наличия денег в банкомате
        int[] checkValue = new int[realValue.length];

        for (int j = 0; j < value.length; j++) {
            checkValue[j] = countGet[j];
        }

        int summ = 0;
        boolean flag = true;
        if (checkValue != null && realValue != null) {
            if (checkValue.length != realValue.length) {
                flag = false;
            } else {
                for (int h = 0; h < realValue.length; h++) {
                    if (realValue[h] >= checkValue[h]) {
                        flag = true;
                    } else {
                        flag = false;
                        System.out.println("Нет денег в банкомате");
                    }
                }

                if (flag == true) {
                    for (int j = 0; j < value.length; j++) {
                        summ += value[j] * checkValue[j];
                    }
                    System.out.println("Возможная сумма к выдачи: " + summ);
                }
            }

            if (flag == true && summ == requestGetMoney) {
                for (int j = 0; j < value.length; j++) {
                    System.out.println("Номинал: " + value[j] + " колличество " + countGet[j]);
                }
            } else {
                System.out.println("Нет подходящих купюр для введенной суммы");
                flag = false;
            }
        }
        System.out.println(flag);
        return flag;
    }
}