import java.util.Random;

public class Captcha {
    String alphaNumeric = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVSXYZ";
    int randLength;
    int randIndex;
    String captcha = "";
    public int generateLength(){
        randLength = new Random().nextInt(4)+4;
        return randLength;
    }
    public int generateIndex(){
        randIndex = new Random().nextInt(alphaNumeric.length());
        return randIndex;
    }
    public String generateCaptcha(){
        for (int x=1; x <= randLength; x++){
            char chr = alphaNumeric.charAt(generateIndex());
            captcha += chr;
        }
        return captcha;
    }
}
