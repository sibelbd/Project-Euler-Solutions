/*The prime factors of 13195 are 5, 7, 13 and 29.
*
*What is the largest prime factor of the number 600851475143 ?
*ANSWER: 6857
*/


public class Main{
  public static void main (String[] args){
    
    //variable for the originalNumber, this will be different by the end of the program
    long originalNumber = 600851475143L;
    
    //variable to hold the largest prime number, it is also our counter
    long count = 1L;
    


    /* This while loop will run as long as the originalNumber is not 1
     * if original number is one, program skips to print statement and prints
     * 1 as largest factor because count is already equal to 1.
     */
    while (originalNumber != 1){


      /*if statement breaks up program into two parts:
       *---a section that divides originalNumber by 2 until
       *   it can only be divided by odd numbers
       *---a section to iterate through and divide all odd 
       *   numbers until originalNumber == 1
       */
      if (count == 1){
        
        //increment count because the original number is not 1 
        //so we begin searching for prime numbers from 2
        count++;
        
        //while loop divides originalNumber by two until
        //it is no longer divisible
        while (originalNumber % count ==0){
          originalNumber /= count;
        }

        //increments count if largest prime is not two
        if (originalNumber != 1){
         count++;
        }
      }

      //upon second iteration of while loop else-if runs
      //if largest prime is not two
      else if (count >= 3){

        //while loop exits when originalNumber = 1
        //AKA when largest prime is found
        while (originalNumber != 1){

          /*divides by count as many times as posible then increments
           *count upon next iteration of loop, then repeats until
           *largest prime is found
           */
          if (originalNumber % count == 0){
            originalNumber /= count;
          }
          else{
            count += 2;
          }
          
        }

      }
    }

    //if-else tests for if count (and therefore initial originalNumber) is 1 (not prime) 
    //or some other number, then prints appropriate statement.
    if (count != 1){
      System.out.print( "The largest prime factor is " + count +".");
    }
    else{
      System.out.print( "The number entered is 1 and therefore has no prime numbers.");
    }
  }
}