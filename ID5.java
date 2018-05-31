/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10     *without any remainder.
*
* What is the smallest positive number that is evenly divisible by all of the numbers from * 1 to 20?
*/

public class ID5 {
  public static void main(String[] args) {
    
    //smallestMult will hold the smallest multiple once its multFound
    //for now it is set to zero
    int smallestMult = 0;

    //multFound will end the loop iterating through numbers to find the smallestMult
    boolean multFound = false;

    //divCounter counts how many integers, one through the upperLimit, divide evenly
    //we want divCounter to equal 20 because we need all 20 integers to divide evenly
    int divCounter = 0;

    //upperLimit is the variable for the largest number the multiple must be
    //divisible by
    int upperLimit= 20;

    //var is our variable that will be incremented and tested for divisibility 
    int var= upperLimit;

    //while loop iterates through numbers until a multiple is found
    while (multFound==false){
      
      //for loop iterates through divisions 1-20 and increments divCounter for 
      //each one that divides evenly
      for (int i=1; i<=upperLimit; i++){
        if (var % i == 0){
          divCounter++;
        }
      }

      /*if loop sets up the end of program if div is found
      * it transfers the smallest multiple from var to smallestMult 
      * changes the condition of multFound to true to exit the while loop
      */
      if (divCounter == upperLimit){
        smallestMult= var;
        multFound = true;
      }

      //reset divCounter for next iteration in case smallestMult
      //is not found
      divCounter= 0;

      //increments var by upperLimit for next iteration in case smallestMult
      //is not found
      var += upperLimit;
    }

    //print smallestMult
    System.out.println(smallestMult);
  }
}

/* This one wasn't terrible but I did run into some issues. I tried to
* make the code as reusable as possible. There are multiple places where
* I used the value for the upperLimit, so I went ahead and created the variable
* so it could be accessed and changed in one swift move. I was also initially
* being a dingus by incrementing the loop by 1 and crashing my IDE several times.
* I thought about it for a while, "there's got to be a way to do this more efficiently."
* I was thinking about O-notation and couldn't see an issue there, moved up var
* to start at 2520, the number given by the problem to be divisible by all numbers
* 1 through 10, and then it hit me. The smallestMult must be divisible by 20, which
* means smallestMult, being a multiple of 20, must be found by incrementing
* by 20. I was about to start at 0, but this caused an error when testing divisibility with * the modulus, so I began at the upperLimit itself which made more sense in the first
* place. Doing this saved an incredible amount of computing power and time.
*/ 
