public class Players{
    private String name;
    private int randomNumber;
    private boolean status = false;
    public void setName(String name){
        this.name = name;
    }
    public void setRandomNumber(int randomNumber){
        this.randomNumber = randomNumber;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public int getRandomNumber() {
        return randomNumber;
    }
    public boolean getStatus() {
        return status;
    }
}