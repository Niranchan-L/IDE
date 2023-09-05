public class Table{
    private int number;
    private int n;
    public static void main(String[] args){
        Table t = new Table();
        t.createTable();
    }
    public Table(){
        System.out.println("No number specified!");
    }
    public Table(int number){
        this.number=number;
        n=10;
    }
    public Table(int number, int n){
        this.number = number;
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public int getNumber(){
        return number;
    }
    public void setN(int n){
        this.n = n;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void createTable(){
        for (int x=1; x<=getN(); x++){
            System.out.println(getNumber()+" x "+x+" = "+(getNumber()*x));
        }
    }
}