package controlflow.core;

public class FirstLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstNum = number % 10;
        int pickNum = 0;
        int sum = 0;

        while (number != 0) {

            pickNum = number % 10;
            number /= 10;

        }
        sum = firstNum + pickNum;
        return sum;
    }
}
