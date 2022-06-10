package controlflow.core;

public class SharedDigit {
    public static void main(String[] args) {
        
        System.out.println(hasSharedDigit(20, 92));
    }

    public static boolean hasSharedDigit(int val1, int val2) {

        boolean isShared = false;
        int pickVal1 = 0;
        int pickVal2 = 0;
        int valOne = val1;
        int valTwo = val2;

        if((val1 >= 10 && val1 <= 99) && (val2 >= 10 && val2 <= 99)) {
            
            while(valOne != 0) {
                pickVal1 = valOne % 10;
                
                while(valTwo != 0) {
                    pickVal2 = valTwo % 10;
                
                    if(pickVal1 == pickVal2) {
                        isShared = true;
                        break;
                    }
                    valTwo /= 10;
                }
                valTwo = val2;
                valOne /= 10;
                
                if(isShared) {
                    break;
                }
            }
        }

        return isShared;
    }
    
}
