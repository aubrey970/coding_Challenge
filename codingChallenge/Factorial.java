import java.util.*;
/* A java Class that computes the Factorial of a given number
*/
public class Factorial
{
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
}