public class FindCycle {
    public static void main(String args[]){
        FindCycle find = new FindCycle();
        System.out.println(find.result(13));
        System.out.println(find.canVote(13));
        System.out.println(find.findSenior(13));
    }
    public String result(int age){
        String last = "";

        if (age == 0){
            last = "Foetus";
        }
        else if (age <= 1){
            last = "Infant";
        }
        else if (age <= 3){
            last = "Toddler";
        }
        else if (age <= 5){
            last = "Preschooler";
        }
        else if (age <= 12){
            last = "Primary School Boy";
        }
        else if (age <= 19){
            last = "Teenager";
        }
        else if (age <= 35){
            last = "Depressed Person";
        }
        else if (age <= 64){
            last = "Adult";
        }
        else if (age > 65){
            last = "Old Person";
        }
        else{
            last = "Invalid age";
        }
        return "Cycle: "+last;
    }

    public boolean findSenior(int age){
        if (age >= 35){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean canVote(int age){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
