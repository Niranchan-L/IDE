import java.util.Scanner;

public class Converter {
    long oneLightYear = 9460730472580L;
    double oneKm = 1.057000834E-13;
    String decide;
    int value;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Convert to (KM) or (LY): ");
        decide = scan.next().toUpperCase();
        if (decide.equals("KM")){
            System.out.print("Enter LightYear: ");
            value = scan.nextInt();
            scan.close();
            toKm();
        }
        else if (decide.equals("LY")){
            System.out.print("Enter Kilometer: ");
            value = scan.nextInt();
            scan.close();
            toLy();
        }
        else{
            System.out.println("Invalid input!");
        }
    }
    public void toKm(){
        System.out.println(value+" Light Year = "+(oneLightYear * value)+" Kilometer");
    }
    public void toLy() {
        System.out.println(value + " Kilometer = " + (oneKm * value)+" LightYears");
    }
}
