package task_05_wrapper;

import java.math.BigDecimal;

public class Number {
    private int integer;
    private double aDouble;
    private BigDecimal bigDecimal;

    public Number (int integer, double aDouble, BigDecimal bigDecimal)
    {
        this.integer = integer;
        this.aDouble = aDouble;
        this.bigDecimal = bigDecimal;
    }

    public BigDecimal summ (final int integer)
    {
        return new BigDecimal(integer + integer);
    }

    public BigDecimal summ (int integer, double aDouble)
    {
        return new BigDecimal(integer + aDouble);
    }

    public BigDecimal summ (int integer, double aDouble, BigDecimal bigDecimal)
    {
        return new BigDecimal(integer + aDouble + bigDecimal.floatValue());
    }

    public float divide (BigDecimal bigDecimalOne, BigDecimal bigDecimalTwo)
    {
        if (bigDecimalTwo.intValue() == 0)
        {
            System.out.println("Fuck, cannot be divided by 0");
        }
        return (bigDecimalOne.floatValue()/bigDecimalTwo.floatValue());
    }

    public float divide (BigDecimal bigDecimalOne, BigDecimal bigDecimalTwo, int integer, double aDouble)
    {
        if (bigDecimalTwo.intValue() == 0 || aDouble == 0 || integer == 0)
        {
            System.out.println("Fuck, cannot be divided by 0");
            return -1;
        }
        return (float) (((bigDecimalOne.doubleValue()/bigDecimalTwo.doubleValue())/aDouble)/integer);
    }
}