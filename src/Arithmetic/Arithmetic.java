package Arithmetic;

public class Arithmetic<Number1 extends Number, Number2 extends Number> {
    Number1 num1;
    Number2 num2;
    Number result;
    public Arithmetic(Number1 num1, Number2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number getNum1() {
        return num1;
    }

    public Number getNum2() {
        return num2;
    }

    //

    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() {
        if(num2.equals(0)) {
            throw new ArithmeticException("sayop");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin() {
        if(num1.doubleValue() < num2.doubleValue()) {
            return num1;
        }
        return num2;
    }

    public Number getMax() {
        if(num1.doubleValue() > num2.doubleValue()) {
            return num1;
        }
        return num2;
    }

}
