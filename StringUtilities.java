import java.util.Scanner;

public class StringUtilities {
    String sentence="";
    int lineCount;
    int wordCount;
    int characterCount;
    boolean chrContains;
    int subStringCount;
    String reverse="";
    String toggle="";
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sentence (type 'end' to stop): ");
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("end")){
                break;
            }
            sentence+=line+" ";
            lineCount++;
        }
    }
    public int getLineCount(){
        return lineCount;
    }
    public int getWordCount(){
        if (!sentence.trim().equals("")){
            String[] words = sentence.split(" ");
            wordCount=words.length;
        }
        return wordCount;
    }
    public int getCharacterCount(){
        characterCount = sentence.trim().length();
        return characterCount;
    }
    public boolean getChrContains(){
        String subStr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Chr: ");
        subStr = scan.nextLine();
        if (sentence.contains(subStr)){
            chrContains = true;
        }
        return chrContains;
    }
    public int getSubstringCount(){
        String subStr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        subStr = scan.nextLine();
        String[] str = sentence.split(subStr);
        if (sentence.endsWith(subStr)){
            subStringCount=str.length;
            return subStringCount;
        }
        subStringCount=str.length-1;
        return subStringCount;
    }
    public void chrSplit(){
        String chr;
        int num=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Chr: ");
        chr = scan.next();
        String[] list = sentence.split(chr);
        for (int i=0; i<list.length; i++){
            if (list[i].trim().equals("")){
                continue;
            }
            System.out.println(num+". "+list[i].trim());
            num++;
        }
    }
    public String convertToUppercase(){
        return sentence.toUpperCase();
    }
    public String convertToLowercase(){
        return sentence.toLowerCase();
    }
    public String toReverse(){
        for (int i=sentence.length()-1; i>=0; i--){
            char chr = sentence.charAt(i);
            reverse+=chr;
        }
        return reverse;
    }
    public String toToggleCase(){
        for (int i=0; i<sentence.length(); i++){
            char chr = sentence.charAt(i);
            if (Character.isUpperCase(chr)){
                toggle+=Character.toLowerCase(chr);
            }
            else{
                toggle+=Character.toUpperCase(chr);
            }
        }
        return toggle;
    }
}