public class Laptop{
    public static void main(String args[]){
        Laptop lap = new Laptop();
        lap.start();
        System.out.println(lap.price);
    }

    String processor = "Intel-core-i9";
    String modelNumber = "i9-13700H";
    String display = "LED";
    String os = "Linux";
    int ramStorage = 16;
    int graphicsCardStorage = 8;
    int price = 345000;

    public void start(){
        price=20;
        System.out.println("Booting...");
    }
    public void shutDown(){
        System.out.println("Shutting down, in 3..2..1");
    }
    public void restart(){
        System.out.println("Restarting...");
    }
    public void logOut(){
        System.out.println("Logging out...");
    }
}