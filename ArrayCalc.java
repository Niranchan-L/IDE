public class ArrayCalc {
    public static void main(String[] args){
        ArrayCalc calc = new ArrayCalc(new int[]{23,67,38,61,95});
        System.out.println(calc);
        System.out.println("Min = "+calc.findMin());
        System.out.println("Max = "+calc.findMax());
        System.out.println("Sum = "+calc.findSum());
        System.out.println("isNumberExists = "+calc.isExists(95));
        System.out.println("indexValue = "+calc.indexValue(2));
        System.out.println("isDivisible = "+calc.isDivisible(2));
        System.out.println("isSumOdd = "+calc.isSumOdd());
        System.out.println("isSumEven = "+calc.isSumEven());
    }
    private int[] arr;
    public ArrayCalc(){
        arr = new int[5];
    }
    public ArrayCalc(int[] arr){
        this.arr= arr;
    }
    public int findMin(){
        int min=findMax();
        for (int x=0; x<arr.length; x++){
            if (arr[x] <= min) {
                min = arr[x];
            }
        }
        return min;
    }
    public int findMax(){
        int max=0;
        for (int x=0; x<arr.length; x++){
            if (arr[x] >= max) {
                max = arr[x];
            }
        }
        return max;
    }
    public int findSum(){
        int sum=0;
        for (int x=0; x<arr.length; x++){
            sum+=arr[x];
        }
        return sum;
    }
    public boolean isExists(int value){
        int length = (int)arr.length/2;
        if (arr[length] == value || arr[length+1] == value){
            return true;
        }
        else {
            for (int x = 0, y = arr.length - 1; x < arr.length || y >= 0; x++, y--) {
                if (arr[x] == value) {
                    return true;
                } else if (arr[y] == value) {
                    return true;
                }
            }
        }
        return false;
    }
    public String toString(){
        String values="[";
        if (arr.length>0){
            for (int x = 0; x < arr.length; x++) {
                if (x == arr.length - 1) {
                    values += arr[x] + "]";
                } else {
                    values += arr[x] + ", ";
                }
            }
        }
        else {
            values+="]";
        }
        return values;
    }
    public int indexValue(int index){
        if (index<arr.length){
            return arr[index];
        }
        else{
            return -1;
        }
    }
    public boolean isDivisible(int divisor){
        for(int x=0; x<arr.length; x++){
            if (arr[x]%divisor==0){
                return true;
            }
        }
        return false;
    }
    public boolean isSumOdd(){
        if (findSum()%2==1){
            return true;
        }
        return false;
    }
    public boolean isSumEven(){
        if (findSum()%2==0){
            return true;
        }
        return false;
    }
}
