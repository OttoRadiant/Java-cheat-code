import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

public static void main(String[] args) {

    
   Scanner sc = new Scanner(System.in); 
    int userinput = -1;
    // boolean validinput = false;

    while(userinput < 0)
     {
        System.out.println("Enter a number it wont allow alphabets");
    
    try {
        userinput = sc.nextInt();
        if (userinput > 0){
            
            System.out.println("Entered number is " + userinput);
        }
        else {
            System.out.println("Enter a Positive Integer");
        }
        // validinput = true;    
         }
     
     catch (InputMismatchException e) {
        System.out.println("Wrong Input, Try Again!");
        sc.next();
        
    }
   } 
  }
 }

    // System.out.println("You have Entered the number " + userinput);
    // sc.close();
   
  
