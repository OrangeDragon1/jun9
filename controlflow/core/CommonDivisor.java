package controlflow.core;

public class CommonDivisor {
    
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        
        int CommonDiv = 0;

        if((first >= 10) && (second >= 10)) {
            for(int i = 1; i <= first; i++) {
                if(first % i == 0) {
                    for(int j = 1; j <= second; j++) {
                        if(second % j == 0) {
                            if(i == j) {
                                if(i > CommonDiv) {
                                    CommonDiv = i;
                                }
                            }
                        }
                    }
                }
            }
            return CommonDiv;
        }

        return -1;

    }
}
