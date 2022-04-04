import java.util.Scanner;
public class RightOrNot {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        //A program to find whether the special right triangle is acute or not
        int a = 0;
        int b = 0;
        int c = 0;
        boolean goAgain = false;
        
        System.out.println("\nThis program was based on a thing from my geometry class.");
        System.out.println("Where we have to find out if a triangle is obtuse, acute or right based on its side lengths and the pythagorean theorem.");
        do{
            System.out.println("If you give me any negative numbers the program will make you type them in again.");
            System.out.print("Or if you give 'c' as a smaller number than 'a' or 'b' then it will also make you type them in again.\n");
            System.out.println('-');
            do{
                System.out.print("Give me 'a'\n>");
                a = k.nextInt();

                System.out.print("Give me 'b'\n>");
                b = k.nextInt();

                System.out.print("Give me 'c'\n>");
                c = k.nextInt();
                if(a<0 || b<0 || c<0){
                    System.out.println("No negative numbers, sorry. ¯\\_(ツ)_/¯\n");
                }else if(c<a||c<b){
                    System.out.println("That is a NO NO!\nPlease try again with c being the largest number.");
                }else{
                    //System.out.println("An error has occured.");
                }
            }while((a<0 || b<0 || c<0) || (c<a || c<b));

            	a=a*a;
            	b=b*b;
                c = c*c;
                char type;
                String stuff = "";
 
                if(a+b>c){
                	//acute
                	type = '>';
                	stuff = abToC(type);
                    System.out.println("If("+ stuff +"), then the triangle is an acute triangle.");
                    System.out.println((a+b) + ">" + (c));
                    System.out.println("The triangle is acute.");
                }else if(a+b<c){
                	//obtuse
                    type = '<';
                    stuff = abToC(type);
                    System.out.println("If("+ stuff +"), then the triangle is an obtuse triangle.");
                    System.out.println((a+b) + "<" + (c));
                    System.out.println("The triangle is obtuse.");
                }else if(a+b==c){
                	//right
                    type = '≍';
                    stuff = abToC(type);
                    System.out.println("If("+ stuff +"), then the triangle is a right triangle.");
                    System.out.println((a+b) + "≍" + (c));
                    System.out.println("The triangle is a right triangle.");
                }else{
                    System.out.println("I don't know WHAT you typed in, but something got real messed up...");
                }

                char choice;
                do{
		            System.out.print("Would you like to go again?('t' for yes or 'f' for no)\n>");
		            String input = k.next();
		            choice = input.charAt(0);
		            switch (choice){
		            	case 't':
		            	goAgain=true;
		            	System.out.println('-');
		            	break;
		            	case 'f':
		            	goAgain=false;
		            	System.out.println("You chose to not go again.\nBye bye user.");
		            	break;
		            	default:
		            	System.out.println("That is not one of the options...");
		            	System.out.println("Try again user.");
		            }
                }while(choice!='f' && choice!='t');
        }while(goAgain);
    }
    public static String abToC(char r){
    	String w = "";
    	switch (r){
    		case '≍':
    		//System.out.println("a²+b²"+ r +"c²");
    		w="a²+b²"+ r +"c²";
    		break;
    		case '<':
    		//System.out.println("a²+b²"+ r +"c²");
    		w="a²+b²"+ r +"c²";
    		break;
    		case '>':
    		//System.out.println("a²+b²"+ r +"c²");
    		w="a²+b²"+ r +"c²";
    		break;
    		default:
    		System.out.println("AN ERROR HAS OCCURED IN METHOD \"abToC\"!");
    	}
    	return w;
    	/*
    	if(r){
    		System.out.println("a²+b²=c²");
		}else if(!r){
			System.out.println("a²+b²=c²");
		}else if(){
		
		}
		*/
    }
}
