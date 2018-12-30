package rpggame;
import java.util.Scanner;

/**
 * @author Darragh O'Connor
 * 
 * Doesn't work and is not called 
 * 
 * 
 */

public class nameSelection {
    public static void select(String[] arguments){
        Scanner input = new Scanner(System.in);

        String username;
        double age;
        String gender;

        // Allows a person to enter his/her name   
        Scanner one = new Scanner(System.in);
        System.out.println("Enter Name:" );  
        username = one.next();
        System.out.println("Name accepted " + username);

        // Allows a person to enter his/her age   
        Scanner two = new Scanner(System.in);
        System.out.println("Enter Age:" );  
        age = two.nextDouble();
        System.out.println("Age accepted " + age);

        // Allows a person to enter his/her gender  
        Scanner three = new Scanner(System.in);
        System.out.println("Enter Gender:" );  
        gender = three.next();
        System.out.println("Gender accepted " + gender);

     System.out.println("Hero " + username + "let's fight");
     System.out.println("GAME ON");
     

    }
}

