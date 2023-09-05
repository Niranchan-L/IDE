import java.util.Scanner;

public class Emoji{
    public static void main(String[] args) {
        Emoji emoji = new Emoji();
//        emoji.inputs();
//        emoji.parse();
//         System.out.println("Try using"+"\ud83d\udc4d"+"\uD83D\uDC4E"+"\u2764"+"\uD83D\uDE4F"+"\uD83D\uDC4B");
//         emoji.inputs();
//         emoji.deemojize();
    }
    String word = "";
    public void inputs() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the sentence with emoji word:");
        word = scanObj.nextLine();
        scanObj.close();
    }
    public void parse() {
        String names[] = word.split(":");
        //System.out.println(names[1]);
        if (names[1].equals("thumbsup")) {
            System.out.println(names[0] + " " + "\ud83d\udc4d");
        } else if (names[1].equals("thumbsdown")) {
            System.out.println(names[0] + " " + "\uD83D\uDC4E");
        } else if (names[1].equals("heart")) {
            System.out.println(names[0] + " " + "\u2764");
        } else if (names[1].equals("pray")) {
            System.out.println(names[0] + " " + "\uD83D\uDE4F");
        } else if (names[1].equals("bye")) {
            System.out.println(names[0] + " " + "\uD83D\uDC4B");
        }
    }
    public void deemojize() {
        String names[] = word.split(" ");
        if (names[1].equals("\ud83d\udc4d")){
            System.out.println(names[0]+" "+"Thumbsup");
        }
        else if (names[1].equals("\uD83D\uDC4E")){
            System.out.println(names[0]+" "+"Thumbsdown");
        }
        else if (names[1].equals("\u2764")){
            System.out.println(names[0]+" "+"Heart");
        }
        else if (names[1].equals("\uD83D\uDE4F")){
            System.out.println(names[0]+" "+"Pray");
        }
        else if (names[1].equals("\uD83D\uDC4B")){
            System.out.println(names[0]+" "+"Bye");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}