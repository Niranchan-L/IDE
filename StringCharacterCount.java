import java.util.Scanner;

public class StringCharacterCount {
    String word = "";
    int upperCount = 0;
    int lowerCount = 0;
    int numCount = 0;
    int specialChrCount = 0;
    String specialChr = "@#%$!";
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        word = scan.next();
    }
    public void count(){
        for (int x=0; x<word.length(); x++) {
            int chr = word.charAt(x);
            if (chr >= 97 && chr <= 122) {
                lowerCount += 1;
            }
            else if (chr >= 65 && chr <= 90) {
                upperCount += 1;
            }
            else if (chr >= 48 && chr <= 57) {
                numCount += 1;
            }
            else {
                for (int y=0; y<specialChr.length(); y++){
                    char sc = specialChr.charAt(y);
                    if (chr == sc){
                        specialChrCount+=1;
                    }
                }
            }
        }
        System.out.println("Lowercase Characters: "+lowerCount);
        System.out.println("Uppercase Characters: "+upperCount);
        System.out.println("Numbers Count: "+numCount);
        System.out.println("Special Characters: "+specialChrCount);
    }
}
