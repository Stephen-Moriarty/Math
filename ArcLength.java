import java.util.Scanner;
public class ArcLength {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        double radius = 0;
        double angle = 0;
        boolean goAgain = false;
        System.out.println("This program is meant to find the length of an arc on a circle.");
        do{
            do{
                System.out.println("Give me a radius:");
                radius = k.nextDouble();
                if(radius<=0){
                    goAgain=true;
                    badUser();
                }else{
                    goAgain=false;
                }    
            }while(goAgain);

            do{
                System.out.println("Give me angle:");
                angle = k.nextDouble();
                if(angle==0||angle == -360){
                    angle = 360;
                    goAgain=false;
                }else{
                    informUser(angle);
                    angle = changeToAcceptable(angle);
                    goAgain=false;
                }
            }while(goAgain);

            double secondHalf;
            secondHalf = (angle/360);
            System.out.println("Used for both:");
            System.out.println(angle+ "÷360° = " +secondHalf);
            divider();
            System.out.println("Decimal:");
            double firstHalf;
            firstHalf = (2*Math.PI)*radius;
            System.out.println("2×π×"+radius+" = "+firstHalf);
            double answer;
            answer = firstHalf*secondHalf;
            System.out.println(firstHalf+ "×" + secondHalf + " = " + answer);
            System.out.println("Answer that you can round yourself is:\n"+answer);

            //In terms of pi:
            divider();
            System.out.println("π:");
            firstHalf = 2*radius;
            System.out.println("2×"+radius+" = "+firstHalf);
            answer = 0.0;
            answer = firstHalf*secondHalf;
            System.out.println(firstHalf+ "×" + secondHalf + " = " + answer);
            System.out.println("Answer in terms of π is:\n"+answer+ "π");
            divider();
            goAgain=moreThanOnce(goAgain);
        }while(goAgain);
        System.out.println("Okay bye.");
        k.close();
    }
    public static void divider(){
        for(int i=0; i<80; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static boolean moreThanOnce(boolean j){
        String input;
        char choice;
        j = false;
        System.out.println("Would you like to go again? [y/n]");
        do{
            input=k.next().toLowerCase();
            choice = input.charAt(0);
            if(choice == 'y'){
                j = true;
                divider();
            }else if(choice == 'n'){
                j = false;
            }else{
                badUser();
                System.out.println("Choose 'y' or 'n'.");
            }
        }while(choice != 'y' && choice != 'n');
        return j;
    }
    public static void badUser(){
        System.out.println("I don't accept that here.");
    }
    public static double changeToAcceptable(double a){
        double temp = 0.0;
        if(a>360){
           temp = a-360;
           if(temp>360){
                return changeToAcceptable(temp);
           }else{
               return a-360;
           }
        }else if(a<0){
            temp = a+360;
            if(temp<=0){
                return changeToAcceptable(temp);
           }else{
               return a+360;
           }
        }else{
            return a;
        }
    }
    public static void informUser(double b){
        if(b>360){
            System.out.println("Since you gave me an angle greater than 360 I changed it to a number I accept.");
        }else if(b<0){
            System.out.println("Since you gave me an angle less then 0 I changed it to a number I accept.");
        }else if(b<361||b>0){
            //Do nothing
        }else{
            System.out.println("An error has occured in \"informUser\" method");
        }
    }
}
