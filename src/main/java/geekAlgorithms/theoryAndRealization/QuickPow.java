package geekAlgorithms.theoryAndRealization;

import java.security.SecureRandom;
import java.util.Random;

public class QuickPow {
    public static QuickPow myInstatnce = new QuickPow();

    public static QuickPow getInstance () {return myInstatnce;}

    private QuickPow () {}

    public long pow (int a, int b) {
        int res = 1;
        while(b>0) {
            if (b % 2 == 0) {
                a *= a;
                b /= 2;
            } else {
                res *= a;
                b--;
            }
        }
        return res;
    }

    public long recursionPow(int number, int degree) {
        if(degree == 0) {
            return 1;
        }else if (degree%2==0){
           return recursionPow(number,degree/2) * recursionPow(number,degree/2);
        }else {
            return number* recursionPow(number, degree-1);
        }
    }

    public static Random rand = new Random();

    public static SecureRandom secureRandom = new SecureRandom(); // для задач связанных с шифрованием(криптографией)
}
