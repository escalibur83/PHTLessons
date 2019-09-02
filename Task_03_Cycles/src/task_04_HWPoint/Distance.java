package task_04_HWPoint;

public class Distance {

    public double distance(Point point, int x, int y)
    {

        int x2 = point.getX();
        int y2 = point.getY();

        double distance = Math.hypot(x-x2, y-y2);
        return distance;
    }

}
