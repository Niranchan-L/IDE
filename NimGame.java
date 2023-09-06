import java.util.Random;
import java.util.Scanner;

public class NimGame {
    private static int n;
    private String playerName;
    private int[] numbers;
    private boolean isComputer;
    private boolean isWon=false;
    public NimGame(){
        numbers=new int[] {1,2,3,4,5};
    }
    public NimGame(String playerName, boolean isComputer){
        this.playerName=playerName;
        this.isComputer=isComputer;
        setNumbers();
    }
    public String getPlayerName(){
        return playerName;
    }
    public boolean getIsComputer(){
        return isComputer;
    }
    @Override
    public String toString(){
        String result="[";
        for (int x=0; x<numbers.length; x++){
            if (x==numbers.length-1){
                result+=numbers[x]+"]";
            }
            else{
                result+=numbers[x]+", ";
            }
        }
        return result;
    }
    public void setNumbers(){
        int[] num = new int[n];
        for (int x=0; x<num.length; x++){
            num[x] = x+1;
        }
        numbers=num;
    }
    public void deletion(int value){
        int[] deletion = new int[0];
        if (value>2 || value<0){
            System.out.println("Invalid Number!");
        }
        else {
            if (numbers.length - value <= 0) {
                isWon = true;
            } else {
                deletion = new int[numbers.length - value];
                for (int x = 0; x < numbers.length - value; x++) {
                    deletion[x] = x + 1;
                }
            }
            numbers=deletion;
        }
    }
    public int randomNumber(){
        return new Random().nextInt(3-1)+1;
    }
    public int input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter "+this.getPlayerName()+": ");
        int d = scan.nextInt();
        return d;
    }
    public void play(NimGame p2){
        boolean order = false;
        int cd;
        int pd;
        while (this.numbers.length>0 && p2.numbers.length>0){
            if (p2.getIsComputer() && order){
                cd = randomNumber();
                p2.deletion(cd);
                if (p2.isWon){
                    System.out.println(p2.getPlayerName()+" (Computer) = []");
                    System.out.println(p2.getPlayerName()+" (Computer) Deleted "+cd+" elements");
                    System.out.println("\n"+p2.getPlayerName()+" - COMPUTER Won!");
                    break;
                }
                else{
                    System.out.println(p2.getPlayerName()+" (Computer) = "+p2);
                    System.out.println(p2.getPlayerName()+" (Computer) Deleted "+cd+" elements");
                }
                order=false;
            }
            else{
                pd = input();
                deletion(pd);
                if (isWon){
                    System.out.println(this.getPlayerName()+" = []");
                    System.out.println(this.getPlayerName()+" Deleted "+pd+" elements");
                    p2.deletion(randomNumber());
                    if (p2.numbers.length==0){
                        System.out.println(p2.getPlayerName()+" (Computer) = []");
                    }
                    else{
                        System.out.println(p2.getPlayerName()+" (Computer) = "+p2);
                    }
                    System.out.println("\n"+this.getPlayerName()+" - USER Won!");
                    break;
                }
                else{
                    System.out.println(this.getPlayerName()+" = "+this);
                    System.out.println(this.getPlayerName()+" Deleted "+pd+" elements");
                }
                order=true;
            }

        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter range: ");
        n = scan.nextInt();
        System.out.println();
        NimGame p1 = new NimGame("Jimmy",false);
        NimGame p2 = new NimGame("Jack",true);
        System.out.println(p1.getPlayerName()+" = "+p1);
        System.out.println(p2.getPlayerName()+" (Computer) = "+p2);
        p1.play(p2);
    }
}
