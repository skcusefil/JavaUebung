public class Complex implements Comparable<Complex> {
    double real;
    double imaginary;
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public  double abs(){
        return Math.sqrt(real*real+imaginary*imaginary);
    }

    public Complex add(Complex rhs) {
        return new Complex(real + rhs.real, imaginary + rhs.imaginary);
    }

    public Complex multiply(Complex rhs) {
        return new Complex(real * rhs.real - imaginary * rhs.imaginary,
                real * rhs.imaginary + imaginary * rhs.real);
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(abs(), o.abs());
    }

    @Override
    public String toString() {
        return real + (imaginary != 0 ? " + i * " + imaginary : "");
    }
}

