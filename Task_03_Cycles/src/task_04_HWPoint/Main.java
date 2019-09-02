package task_04_HWPoint;
/*
Внимание. При выполнении задания держите в уме принципи нкапсуляции.

Создать класс Point, описывающий точку в двумерных координатах.
Полями этого класса должны быть координаты x и y.
Класс должен иметь один конструктор, принимающий координаты x и y.
Сделайте информацию о координатах скрытой, а получить её можно только с помощью методов доступа (get/set).
Создать метод distance, принимающий объект Point и определяющий расстояние до неё.

Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
Создать следующие методы в классе Rectangle :
- Высчитывающий площадь прямоугольника
- Высчитывающий длину диагонали
Написать тестовый класс с методом main программу,
демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

public class Main {
    public static void main(String[] args)
    {
        Point point = new Point(1,2);

        Distance distance = new Distance();
        System.out.println(point.getX() + " " + point.getY());
        System.out.println("Distance between Point and next point; " + distance.distance(point,4, 5));
    }
}
