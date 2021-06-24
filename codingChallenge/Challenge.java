/*This is a java program that responds to a coding challenge posted on slack
*The program generates 10 random numbers
*searches for two numbers from the generated list
*if they exist it computes their sum and computes factorial of the sum
*Author : Aubrey T Basimanebotlhe
*Date : 24/06/2021
 */
 import java.util.*;
 public class Challenge
 {
    
   //boollean search() method allows a user to input two numbers
   //The numbers are then searched in the array of random numbers
   //if they either of them do not exist or both of them do not exist it returns false
   //if they both exist then their sum is computed and it return true
   //then we compute factorial of the sum
    
   public boolean search(int num1,int num2)
   {
        //creating a factorial class object
        Factorial obj = new Factorial();
      //for loop to traverse the array
    
      boolean found = false;
      for(int i=0;i < array.length;i++)
      {
         if(array[i] == num1)
         {
            for(int j =0;j<array.length;j++)
            {
               if(array[j] == num2)
               {
                  int sum = num1 + num2;
                  obj.factorial(sum);
                  found = true;
                  
               }
            }
         }
      }
      return found;
      
   }
  
   //main method to test the above methods 
   public static void main(String [] args)
   {
      //create an object
      Challenge app = new Challenge();
      //app.randomNumberGenerator();
      //app.display();
      //app.search(21,7);
     // app.factorial(4);
      
   }
 }