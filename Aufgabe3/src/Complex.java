public class Complex {
    double real;
    double imaginary;
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public  double abs(){
        return Math.sqrt(real*real+imaginary*imaginary);
    }

}
