class Solution {
    public String firstPalindrome(String[] words) {

        // using a for each loop to traverse through the array words.
        for(String s : words){
            // passing each string in s to the palindrome function to check,
            // if the string is a palindrome or not.
            if(palindrome(s)){
                return s;
            }
        }
        
        // if no strings in the array are not palindrome we just return 
        return "";
    }

    // using an helper function to check if the string is a palidrome or not.
    private boolean palindrome(String s){
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
