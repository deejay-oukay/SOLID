public class Number {
    private final double real;
    private final double imaginary;

    public Number(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Number addition(Number other) {
        return new Number(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Number multiplication(Number other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Number(realPart, imaginaryPart);
    }

    public Number division(Number other) {
        double realPart = ((this.real * other.real) + (this.imaginary * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
        double imaginaryPart = ((this.imaginary * other.real) - (this.real * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
        return new Number(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginary >= 0)
            return real + " + " + imaginary + "i";
        else
            return real + " - " + Math.abs(imaginary) + "i";
    }
}
