/*The sum of the squares of the first ten natural numbers is,
*
*12 + 22 + ... + 102 = 385
*The square of the sum of the first ten natural numbers is,
*
*(1 + 2 + ... + 10)2 = 552 = 3025
*Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
*
*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class ID6 {
  public static void main(String[] args) {

    //calcuates and prints difference between squareOfSums and sumOfSquares
    System.out.println((squareOfSums() - sumOfSquares()));

  }
  //iterate through squares of 1-100 then add to sumOfSquares
  public static int sumOfSquares(){
    int sum = 0;
    for (int i = 1; i<=100; i++){
      sum += (i*i); 
    }
    return sum;
  }

  //iterate through numbers 1 - 100, add numbers to squareOfSums, then find squareOfSums
  public static int squareOfSums(){
    int sum = 0;
    for (int i = 1; i<=100; i++){
      sum += i;
    }
    sum = sum*sum;
    return sum;
  }
}
