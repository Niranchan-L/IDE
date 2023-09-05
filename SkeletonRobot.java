public class SkeletonRobot {
    public static void main(String args[]){
    
        //Creating an object for "SkeletonRobot"
        SkeletonRobot Protector = new SkeletonRobot();
        
        //Calling the properties of the Protector robot given bt=y the user
        Protector.name("Hermoine");
        Protector.color("Red");
        Protector.job("Protector");
        Protector.dresscode("Coffin");
        Protector.software("Middleware");
    }
    //Assigning Robot Properties
    public void color(String val1){
        System.out.println("Color: "+val1);
    }
    public void name(String val2){
        System.out.println("Name: "+val2);
    }
    public void software(String val3){
        System.out.println("Software: "+val3);
    }
    public void job(String val4){
        System.out.println("Job: "+val4);
    }
    public void dresscode(String val5){
        System.out.println("Dresscode: "+val5);
    }
}
