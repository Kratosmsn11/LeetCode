class Solution {
    public int[] countBits(int n) {
        /*
            Idea:

            1) initialize an array "res" of size n+1.

            2) Iterate from 0 to n, & pass the number to the helper function "counter".

            3) The counter function will then:
               a) return 0, if the argument is 0
               b) return the counter function with a/2 as the argument. It will also check, 
                  if one's place is contains 1 or 0 with the 2nd helper function "checker".

            Overall, we are using the similar technique on how we check and obtain each digit
            of an integer.

            Ex: int x = 8 -> 1000
            we divide 8 by 2 to move to the next digit (counter function)
            we mod by 2, to obtain the digit at the 1's place.

            Step 1) x = 8, mod = 0;
            Step 2) x = 4, mod = 0;
            Step 3) x = 2, mod = 0;
            Step 4) x = 2, mod = 1;

            number of 1's = 1 (NOTE: this is not the ans of the solution)     
        */

        // initializint the res array with size n+1.
        int[] res = new int[n+1];
        for(int i = 0; i <= n; i++){
            // invoking the counter function with i as the argument.
            res[i] = counter(i);
        }

        return res;
    }

    // this function will recursively 
    private int counter(int a){
        if(a == 0){
            return 0;
        }
        return (checker(a) ? 1 : 0) + counter(a/2);
    }

    // this function will check if the one's place argument is equal to 1 or not.
    private boolean checker(int b){
        return b%2 == 1;
    }
}
