package controlflow.core;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(12, 60, 40));
        // System.out.println(isValid(1001));
    }

    public static boolean hasSameLastDigit(int val1, int val2, int val3) {

        boolean isSame = false;
        int pickVal1, pickVal2, pickVal3;

        if ((isValid(val1)) && (isValid(val2)) && (isValid(val3))) {
            pickVal1 = val1 % 10;
            pickVal2 = val2 % 10;
            pickVal3 = val3 % 10;

            while (true) {
                if (pickVal1 == pickVal2) {
                    isSame = true;
                    break;
                } else if (pickVal2 == pickVal3) {
                    isSame = true;
                    break;
                } else if (pickVal1 == pickVal3) {
                    isSame = true;
                    break;
                }
                break;
            }
        }

        return isSame;
    }

    public static boolean isValid(int num) {

        if(num >= 10 && num <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
