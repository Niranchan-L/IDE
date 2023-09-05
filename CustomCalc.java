import java.util.Scanner;
public class CustomCalc {
    public static void main(String[] args){
        CustomCalc calc = new CustomCalc();
        calc.input();
        calc.result();
    }
    int num1;
    int num2;
    int num3;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("num1: ");
        num1 = scan.nextInt();
        System.out.print("num2: ");
        num2 = scan.nextInt();
        System.out.print("num3: ");
        num3 = scan.nextInt();
        scan.close();
    }
    public static double mean(int num1, int num2, int num3){
        return (num1+num2+num3)/2;
    }
    public static int findMin(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2),num3);
    }
    public static int findMax(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2),num3);
    }
    public static double findMinSqrt(int num1, int num2, int num3){
        return Math.sqrt(findMin(num1,num2,num3));
    }
    public static double findMaxSqrt(int num1, int num2, int num3){
        return Math.sqrt(findMax(num1,num2,num3));
    }
    public void result(){
        System.out.println();
        System.out.println("Mean = "+mean(num1,num2,num3));
        System.out.println("Min = "+findMin(num1,num2,num3));
        System.out.println("Max = "+findMax(num1,num2,num3));
        System.out.println("MinSqrt = "+findMinSqrt(num1,num2,num3));
        System.out.println("MaxSqrt = "+findMaxSqrt(num1,num2,num3));
    }
}
