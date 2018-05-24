/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class ID1{
    public static void main(String[] args){
        
        //sum of all multiples of 3 or 5
        int sum = 0;
        
        /*loop through all numbers 1 to 1000
        else if used so multiples of 3 and 5 don't get added twice
        i starts at 1 because there is no need to add 0 and waste an iteration
        */
        for (int i=1; i<1000; i++){
            if (i % 3 == 0){
                sum += i;
            }
            else if (i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}