/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumference;

/**
 *
 * @author Marian Y. Larbi
 */
import java.util.Scanner;
//import java.lang.Math;
public class Circumference {

    /**
     * @param args the command line arguments
     */
    //a program to print the area and circumference of a circle
    public static void main(String[] args) {
        Scanner marian=new Scanner(System.in);//creates an object that has the scanner properties
        /*double pi=Math.PI;//imports pi from the Maths object
        double radius=0.0;
        System.out.print("Enter the radius of the circle : ");//accepts input from the user
        radius=marian.nextDouble();
        double circumference=2*pi*radius;
        double area = pi*radius*radius;
        
        System.out.println("The circumference of the circle is : " + circumference + "cm");//prints out the circumference
        System.out.println("The circumference of the circle is : " + Math.round(circumference) + "cm");//this line of code runs the result to the nearest whole number
        System.out.println("The area of the circle is : " + area + "cm squared");//prints out the area
        System.out.println("The area of the circle is : " + Math.round(area) + "cm squared");*/
        
        //this program prints out the volume of a sphere
        double pi=Math.PI;
        double rad=0;
        System.out.print("Enter the radius of the sphere : " );
        rad=marian.nextDouble();
        double volume=(4.0/3.0)*pi*(rad*rad*rad);
        System.out.println("The volume of the sphere is "+ volume + "cm cube");
        System.out.println("The volume of the sphere is "+ Math.round(volume) + "cm cube");
        
        
        // TODO code application logic here
    }
    
}
