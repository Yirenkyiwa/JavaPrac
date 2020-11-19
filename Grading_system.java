/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading_system;

/**
 *
 * @author Marian Y. Larbi
 */
import java.util.Scanner;
public class Grading_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner marian=new Scanner (System.in);
        float grade;
        
        System.out.print("Enter your grade : ");
        grade = marian.nextFloat();
        
        if(grade>=80 && grade<=100){
            System.out.println("You had an 'A'");
        }else if(grade>=75 && grade<=79){
            System.out.println("You had a 'B+");
        }else if(grade>=70 && grade<=74){
            System.out.println("You had a 'B'");
        }else if(grade>=65 && grade<=69){
            System.out.println("You had a 'C+'");
        }else if(grade>=60 && grade<=64){
            System.out.println("You had a 'C'");
        }else if(grade>=55 && grade<=59){
            System.out.println("You had a 'D+'");
        }else if(grade >=50 && grade<=54){
            System.out.println("You had a 'D'");
        }
        else if(grade>=0 && grade <50){
             System.out.println("You had an 'E' ");
        }else{
            System.out.println("Enter a valid grade");
        }
        
       
       /*if(grade >= 80 && grade <= 100){
           System.out.println(" A ");
       }else if(grade >= 75 && grade <= 79){
           System.out.println("B+");
       }else if(grade >= 70 && grade <= 74){
           //System.out.println(' I think it \"s B');
           System.out.println(" I think it \"s\" B");*/
       }
       
       
    }
    

