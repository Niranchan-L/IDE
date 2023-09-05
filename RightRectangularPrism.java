import java.util.Scanner;

public class RightRectangularPrism {
    int l;
    int w;
    int h;
    public void input(){
        Scanner dimension = new Scanner(System.in);
        System.out.print("Enter the value of l: ");
        l = dimension.nextInt();
        System.out.print("Enter the value of w: ");
        w = dimension.nextInt();
        System.out.print("Enter the value of h: ");
        h = dimension.nextInt();
    }
    public void findSurfaceArea(){
        System.out.println("Surface Area = "+((2*((w*l)+(h*l)+(h*w)))));
    }
    public static void main(String[] args) {
        RightRectangularPrism rightRectangularPrism = new RightRectangularPrism();
        rightRectangularPrism.input();
        rightRectangularPrism.findSurfaceArea();
    }
}