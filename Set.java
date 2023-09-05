public class Set {
    private int[] data;
    public Set() {
        this.data = new int[] {34, 56, 78, 90};
    }
    public Set(int[] data) {
        this.data = data;
    }
    public boolean isExists(int[] arr1, int value) {
        boolean isPresent = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
    public int commonValues(int[] arr1, int[] arr2){
        int common=0;
        for(int x=0; x<arr1.length; x++){
            for (int y=0; y<arr2.length; y++){
                if (arr1[x] == arr2[y]){
                    common++;
                }
            }
        }
        return common;
    }
    public int length() {
        return this.data.length;
    }
//    public int[] union(Set obj) {
//        return arr;
//        for (int i = 0; i < this.data.length; i++) {
//            arr[i] = this.data[i];
//        }
//        int counter = this.data.length;
//        for (int i = 0; i < obj.data.length; i++) {
//            if (isExists(arr, obj.data[i])) {
//                arr[counter] = obj.data[i];
//                counter++;
//            }
//        }
//        return arr;
//    }
    public String toString() {
        String res = "";
        if (data != null && data.length > 0) {
            res = "[";
            for (int i = 0; i < data.length; i++) {
                if (i != data.length - 1) {
                    res = res + data[i] + ", ";
                } else {
                    res = res + data[i] + "]";
                }
            }
        } else {
            res = "[1]";
        }
        return res;
    }
    public static void main(String args[]) {
        Set setA = new Set(new int[]{23, 56, 78, 90});
//        System.out.println(setA);
        Set setB = new Set(new int[]{20, 50, 78, 95, 87});
//        System.out.println(setB);
//        System.out.println(new Set(setA.union(setB)));
    }
}