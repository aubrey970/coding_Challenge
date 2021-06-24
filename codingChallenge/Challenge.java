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
   //declare instance variables
   //decalre an integer array of size 10 which will store generated numbers
   int array[];
   int randomNumbers;
   //default constructor to inialize variables
   public Challenge()
   {
      this.array = new int[10];
      this.randomNumbers = randomNumbers;
   }
   //randomNumberGenerator() method which generates 10 random numbers of range 0-100
   //the method then adds the random numbers to an array
   public void randomNumberGenerator()
   {
      //random generator function
      Random number = new Random();
      
      //a for loop to generate 10 random numbers
      //every random number generated is added to the array until its full
      for(int i=0; i < array.length;i++)
      {
         //generate numbers between 0 and 100
         randomNumbers = number.nextInt(100);
         //adding random numbers to the array
         array[i] = randomNumbers;
      }
      
   }
   //factorial () method which computes factorial
   //it takes in a number and computes its factorial
   public int factorial(int sum)
   {    
     if (sum == 0) 
     {
         //since 0 factorial is 1   
       return 1;
     }    
     else 
     {
         int factorialNumber = sum * factorial(sum-1);
       return factorialNumber;
     }   
       
   } 
   //boollean search() method allows a user to input two numbers
   //The numbers are then searched in the array of random numbers
   //if they either of them do not exist or both of them do not exist it returns false
   //if they both exist then their sum is computed and it return true
   //then we compute factorial of the sum
    
   public boolean search(int num1,int num2)
   {
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
                  factorial(sum);
                  found = true;
                  
               }
            }
         }
      }
      return found;
      
   }
   //display() method to print the contents of the array
   public void display()
   {
      
      for(int i=0;i < array.length;i++)
      {
         System.out.println(array[i]);
      }
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