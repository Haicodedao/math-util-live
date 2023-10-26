
package com.fu.mathutil;

public class MathUtil {
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException ("Invalid");
        if(n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
