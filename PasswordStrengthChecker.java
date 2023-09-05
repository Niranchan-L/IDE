import java.util.Scanner;

public class PasswordStrengthChecker {
    String password;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        password = scan.next();
        scan.close();
    }
    public boolean isValidLength(){
        return password.length()>=8;
    }
    public boolean hasSpecialCharacter(){
        return password.matches(".*[/#$@!].*");
    }
    public boolean isDigitPresence(){
        return password.matches(".*[0-9].*");
    }
    public boolean isCaps(){
        return password.matches(".*[A-Z].*");
    }
    public void identifyPasswordStrength(){
        String strength="";
        if (isValidLength() && hasSpecialCharacter() && isDigitPresence() && isCaps()){
            strength="STRONG";
        }
        else if (isValidLength() && isDigitPresence() && isCaps()){
            strength="MoDeRaTe";
        }
        else if (isValidLength()) {
            strength = "weak";
        }
        else {
            strength = "very weak";
        }
        System.out.println("Strength: "+strength);
    }
}