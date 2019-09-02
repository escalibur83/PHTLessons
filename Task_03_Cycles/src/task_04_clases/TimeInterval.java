package task_04_clases;
/*
Создать класс, описывающий промежуток времени.
Сам промежуток времени должен задаваться тремя свойствами:
секундами, минутами и часами.
Создать метод для получения полного количества секунд в объекте.
Создать два конструктора: первый принимает общее количество
секунд, второй - часы, минуты и секунды по отдельности.
Создать метод для вывода данных.
Написать программу для тестирования возможностей класса.
 */

public class TimeInterval {
    int hour;
    int min;
    int sec;
    int seconds;

    public void displayTimeInterval() // метод
    {
        System.out.println("displayTimeIn: " + hour + " : " + min + " : " + sec);
        int fullseconds = 3600 * hour + 60 * min + sec;
        System.out.println("displayTimeInOnlySecond: " + fullseconds);
    }

    public void displaySecond() {
        System.out.println("second:" + seconds);
    }

    public TimeInterval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public TimeInterval(int seconds) {
        this.seconds = seconds;
        hour = seconds/3600;
        min = (seconds/60)-60;
        sec = seconds - (hour*3600) - (min*60);
        System.out.println("Проверка: "+ seconds + "sec = " +hour + "h : " + min + "m : " + sec);

    }
}