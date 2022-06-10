package controlflow.core;

public class EvenDigit {

    public static void main(String[] args) {
        
        System.out.println(getEvenDigitSum(-252));
    }
    
    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int pickNum = 0;

        while(number != 0) {
            pickNum = number % 10;
            if(pickNum % 2 == 0) {
                sum += pickNum;
            }
            number /= 10;
        }
        return sum;
    }
}
