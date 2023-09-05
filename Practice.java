public class Practice{
    public static void main(String[] args){
        int[] x = {1,2,3,4};
        int[] y = x;
        x = new int[2];
        for(int i=0; i<x.length; i++){
            System.out.print(y[i]);
        }
    }
}