public class ArrayOperations {
    private int[] arr;
    public ArrayOperations(int[] arr){
        this.arr=arr;
    }
    public int[] append(int value){
        int[] addition = new int[arr.length+1];
        for (int x=0; x<addition.length-1; x++){
            addition[x] = arr[x];
        }
        addition[addition.length-1] = value;
        return addition;
    }
    public ArrayOperations addData(int value){
        int[] addition = new int[arr.length+1];
        for (int x=0; x<addition.length-1; x++){
            addition[x] = arr[x];
        }
        addition[addition.length-1] = value;
        return new ArrayOperations(addition);
    }
    public String toString(){
        String result="[";
        for (int x=0; x<arr.length; x++){
            if (x==arr.length-1){
                result+=arr[x]+"]";
            }
            else{
                result+=arr[x]+", ";
            }
        }
        return result;
    }
    public static void main(String[] args){
        ArrayOperations can = new ArrayOperations(new int[]{1,2,3,4});
//        System.out.println(new ArrayOperations(can.append(59)));
//        System.out.println(can.addData(59));
//        System.out.println(can.append(5).addData(6));
        System.out.println(can.addData(5).addData(6).addData(9));
    }
}
