import java.util.Scanner;
public class AreaCalc {
    public static void main(String[] args){
        AreaCalc calc = new AreaCalc();
        calc.input();
        calc.result();
    }
    double radius;
    double side;
    double length;
    double width;
    double base;
    double height;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = scan.nextDouble();
        System.out.print("Side: ");
        side = scan.nextDouble();
        System.out.print("Length: ");
        length = scan.nextDouble();
        System.out.print("Width: ");
        width = scan.nextDouble();
        System.out.print("Base: ");
        base = scan.nextDouble();
        System.out.print("height: ");
        height = scan.nextDouble();
        scan.close();
    }
    public static double areaOfCircle(double radius){
        return Math.PI*(radius*radius);
    }
    public static double areaOfSquare(double side){
        return side*side;
    }
    public static double areaOfRectangle(double length, double width){
        return length*width;
    }
    public static double areaOfTriangle(double base, double height){
        return (0.5)*base*height;
    }
    public void result(){
        System.out.println();
        System.out.println("Area of Circle = "+areaOfCircle(radius));
        System.out.println("Area of Square = "+areaOfSquare(side));
        System.out.println("Area of Rectangle = "+areaOfRectangle(length,width));
        System.out.println("Area of Triangle = "+areaOfTriangle(base,height));
    }
}
