public class Decorator implements Interface {
    private final Number number;

    public Decorator(Number number) {
        this.number = number;
    }

    @Override
    public Number addition(Number other) {
        Number result = number.addition(other);
        System.out.println(number +" + "+other+" = "+result);
        return result;
    }

    @Override
    public Number multiplication(Number other) {
        Number result = number.multiplication(other);
        System.out.println(number +" * "+other+" = "+result);
        return result;
    }

    @Override
    public Number division(Number other) {
        Number result = number.division(other);
        System.out.println(number +" / "+other+" = "+result);
        return result;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
