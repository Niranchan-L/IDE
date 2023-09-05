public class Sequence{
    public static void main(String args[]){
        Sequence series = new Sequence();
        series.arithmeticSeries(3);
        series.geometricSeries(3);
    }

    public void arithmeticSeries(int definiteNumber){
        String apSeries="1";
        apSeries = apSeries + ", " + (1 + definiteNumber) + ", " + (1 + (2 *definiteNumber))+ ", " + (1 + (3*definiteNumber)) + " ...";
        System.out.println(apSeries);
    }
    public void geometricSeries(int definiteNumber){
        String gpSeries="1";
        gpSeries = gpSeries + ", " + (definiteNumber) + ", " + (2*(definiteNumber))+ ", " + ((3*definiteNumber)) + " ...";
        System.out.println(gpSeries);
    }

}