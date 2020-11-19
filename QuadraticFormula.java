/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic.formula;

/**
 *
 * @author Marian Y. Larbi
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class QuadraticFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner quadratic =new Scanner(System.in);//creates an object with the scanner features
        double a=0.0,b=0.0,c=0.0;
        double x1,x2,y1,y2;
        System.out.print("Please the enter the value for a : ");//accepts user input
        a=quadratic.nextDouble();
        System.out.print("Please the enter the value for b : ");//accepts user input
        b=quadratic.nextDouble();
        System.out.print("Please the enter the value for c : ");//accepts user input
        c=quadratic.nextDouble();
        y1=-b+(Math.sqrt((b*b)-(4*a*c)));//formula for fist root
        x1=y1/(2*a);
        y2=-b-(Math.sqrt ((b*b)-(4*a*c)));//formula for second root
        x2=y2/(2*a);
        //System.out.println("The first root of your equation is " + x1);
        //System.out.println("The second root of your equation is " + x2);
        System.out.println("The first and second equation are " + x1 + " and " + x2);//prints the two roots with the equation
        
        // TODO code application logic here
    }
    
}
