/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Haier
 */
public class Assignment2 {

    public static int length;
    public static int count;
    public static void main(String[] args) {
       
        
        
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of records you want to enter?");
      length=input.nextInt();

      Student obj1=new Student(length);
      obj1.getInfo();
      obj1.displayinfo();
      
              
              }
    
}
