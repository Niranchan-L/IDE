import java.util.Scanner;
public class Anatomy {
    public static void main(String[] args){
        Anatomy tom = new Anatomy();
        tom.input();
        tom.result();
    }
    private double m;
    private double x;
    private double c;
    public double getM(){
        return m;
    }
    public double getX(){
        return x;
    }
    public double getC(){
        return c;
    }
    public void setM(double m){
        this.m = m;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setC(double c){
        this.c = c;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m: ");
        setM(scan.nextDouble());
        System.out.print("Enter x: ");
        setX(scan.nextDouble());
        System.out.print("Enter c: ");
        setC(scan.nextDouble());
    }
    public void result(){
        System.out.println("y = "+(double) Math.round(((getM()*getX())+getC())*100)/100);
    }
}
