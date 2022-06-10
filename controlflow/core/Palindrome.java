package controlflow.core;

public class Palindrome {
    
    public static void main(String[] args) {
        
        int number = 12269;
        System.out.printf("Is this %d a palindrome? %b. \n", number, isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {

        int newNum = number;
        int reverseNum = 0;
        int pickNum = 0;

        while(newNum != 0) {
            pickNum = newNum % 10;
            newNum /= 10;
            reverseNum *= 10;
            reverseNum += pickNum;
        }
        System.out.printf("The reverse of %d is %d.\n", number, reverseNum);
        return number == reverseNum;
    }
}