public class ComplexNumbers {
    private double real;
    private double imaginary;
    public ComplexNumbers(){
        real=3;
        imaginary=5;
    }
    public ComplexNumbers(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public String toString(){
        if (imaginary < 0){
            return real+" "+imaginary+"i";
        }
        return real+" + "+imaginary+"i";
    }
    public ComplexNumbers multiplication(ComplexNumbers cn){
        double real = (this.getReal()*cn.getReal())-(this.getImaginary()*cn.getImaginary());
        double imaginary = (this.getReal()*cn.getImaginary())+(this.getImaginary()*cn.getReal());
        return new ComplexNumbers(real,imaginary);
    }
//    public ComplexNumbers division(ComplexNumbers cn){
//        double real =
//    }
    public static void main(String[] args){
        ComplexNumbers cn1 = new ComplexNumbers(-3,2);
        ComplexNumbers cn2 = new ComplexNumbers(1,7);
        System.out.println(cn1.multiplication(cn2));
    }
}