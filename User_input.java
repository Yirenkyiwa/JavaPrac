/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_input;

/**
 *
 * @author Marian Y. Larbi
 */
//importing scanner class from the util package
import java.util.Scanner;
public class User_input {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner marian=new Scanner (System.in);
        String input,name; int age;
        //accepts input from  a user
        System.out.print("Please enter a text : ");
        input=marian.nextLine();
        System.out.println("You entered : "+input);
        
        //Accepting a string input (name) from a user
        System.out.print("Please enter name : ");
        name=marian.nextLine();
        System.out.println("Your name is "+name);
        
        //Accepting an integer input from a user
        System.out.print("Please enter age : ");
        age=marian.nextInt();
        System.out.println("You are " + age + " years old");
        
        
    }
    
}
