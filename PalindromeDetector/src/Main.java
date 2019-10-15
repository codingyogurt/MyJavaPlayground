import java.util.Arrays;

public class Main {
    public static boolean isPalindrome(String word) {

        /*
        1. Breakdown the letters into pcs
        2. get the quotient middle
        3. loop through the breakdown letters until the quotient only, together with this, loop through quotient -1 (backwards)
        4. if the first letter and end letter match continue loop, else stop. and return false, else return true
         */

        // prepare the word and convert it to an array of letters
        word = word.toLowerCase();
        String [] letters = word.split("");

        // get the mid part length of the array we will check first and end simultaneously
        int mid = word.length() / 2;

        // loop through the array, if similarity is not found end and return false
        for (int i = 0; i < mid; i++){
            if(!letters[i].equals(letters[letters.length-(i+1)])){
                return false;
            }
        }
        // else
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Main.isPalindrome("racecar"));
    }
}