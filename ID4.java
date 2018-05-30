/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class ID4{
  public static void main(String[] args){
    
    //variable to hold largest palindrome
    String largestPal = "0";

    //hold number forwards for testing
    String numberForwards = "0";

    //hold number backwards for testing
    String numberBackwards = "";

    //for loop to iterate through first number
    for (int i=100; i<=999 ; i++){
      
      //for loop to iterate through second number
      for (int j=100; j<=999; j++){
        
        //adds product to numberForwards
        numberForwards = Integer.toString(i * j);

        //converts number to numberBackwards by interating through
        //numberForwards backwards and adding that number to the string
        for (int k = numberForwards.length(); k > 0; k--){
          numberBackwards += numberForwards.substring(k-1, k);
          
        }
        //tests for palindrome then updates largestPal if number is larger
        //than current largest palindrome
        if (numberBackwards.equals(numberForwards)){
          if (Integer.parseInt(largestPal)< Integer.parseInt(numberForwards)){
            largestPal = numberForwards;
          }
        }

        //clears numberBackwards for next iteration of for loops
        numberBackwards = ""; 
      }
    }
    //prints largest palindrome
    System.out.print(largestPal);  
  }

}