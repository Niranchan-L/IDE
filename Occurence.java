import java.util.Scanner;

public class Occurence {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Occurence driver = new Occurence();
        driver.count();
    }
    public void count(){
        int count=0;
        System.out.print("Enter the String: ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Enter the Character: ");
        char ch = input.nextLine().charAt(0);
        int index[] = {};
        for (int i=0; i < name.length(); i++){
            if (name.charAt(i) == ch){
                count++;
                
            }
        }
        System.out.println("Count = "+count);
    }
}
