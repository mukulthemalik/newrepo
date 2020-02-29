/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;
 
public class Practice {
 
    public static void main(String[] args) {
 
         Scanner in = new Scanner(System.in);
         boolean repeat=false;
       do{ 
         System.out.print("Enter a whole number greater than 0:");
       try{
           String number = in.next();
            int num = Integer.parseInt(number);
         if(num<8)
         {
             Exception e = new Exception("number input cannot be negative");
                throw e;
         }
         System.out.printf("The square of your number is %.2f%n", Math.pow(num, 2));
          repeat =false;
         }
       catch(Exception e){
           System.out.println("enter valid value");
           repeat=true;
       }
       }while(repeat);
       
        
    }
}/* Scanner scanner = new Scanner(System.in);
            boolean repeat = false;
            do{
            System.out.println("Enter a number between 1 and 100");
            try{
            String number = scanner.next();
            int num = Integer.parseInt(number); //NumberFormatException
            //int d = num/0; //Divide by zero exception
            
            if(num <0 )
            {Exception e = new Exception("number input cannot be negative");
                throw e;
            }
            
            System.out.println("Square root of the number:" + Math.sqrt(num));
            repeat = false;
            }
           
            catch(NumberFormatException e)
            {
                System.out.println("Error in user input");
                repeat = true; 
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Divide by zero");
                repeat = false; 
            }
             catch(Exception e)
            {
            }
            
            /*finally{
                System.out.println("In finally block");
            }
            }while(repeat);
    }
        
} */
