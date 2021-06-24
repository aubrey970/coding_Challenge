import java.util.*;
/*
*A java class that generates random numbers
*/
public class Randomiser
{
	//declaration of instance variables
	int randomNumber;
	int array[];

	//default constructor
	public Randomiser()
	{
		array = new int[10];
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
         randomNumber = number.nextInt(100);
         //adding random numbers to the array
         array[i] = randomNumber;
      }
      
   }
    //display() method to print the contents of the array
   public void display()
   {
      
      for(int i=0;i < array.length;i++)
      {
         System.out.println(array[i]);
      }
   }
}