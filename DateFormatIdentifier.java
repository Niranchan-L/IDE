import java.util.Scanner;

public class DateFormatIdentifier {
    String date = "";
    String[] formats;
    int day;
    int month;
    int year;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Date: ");
        date = scan.nextLine();
        formats = date.split("/");
    }
    public boolean isValidLength(){
        if (formats.length==3){
            if (formats[0].length() == 2 && formats[1].length() == 2 && formats[2].length() == 4){
                return true;
            }
        }
        return false;
    }
    public void getDate(){
        if (isValidLength()){
            day = Integer.parseInt(formats[0]);
            month = Integer.parseInt(formats[1]);
            year = Integer.parseInt(formats[2]);
        }
    }
    public boolean isLeapYear(){
        if ((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
            return true;
        }
        return false;
    }
    public boolean isValidDay(){
        if (day >= 1 && day <= 31) {
            return true;
        }
        return false;
    }
    public boolean isValidMonth(){
        if (month >= 1 && month <= 12){
            return true;
        }
        return false;
    }
    public boolean isValidYear(){
        if (year >= 1900 && year <= 2023){
            return true;
        }
        return false;
    }
    public boolean isValidDayWithRespectToMonth(){
        if (isValidDay() && isValidMonth()) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day <= 30) {
                    return true;
                }
                return false;
            }
            else if (month == 2) {
                if (isLeapYear() && day <= 29) {
                    return true;
                }
                else if (day <= 28) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public void isValidDate(){
        if (isValidDay() && isValidMonth() && isValidYear() && isValidLength() && isValidDayWithRespectToMonth()){
            System.out.println("Valid Date!");
        }
        else{
            System.out.println("Invalid Date!");
        }
    }
}