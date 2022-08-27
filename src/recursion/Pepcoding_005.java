/**
 * It calcjulates the power of a number wit negative number handling
 */

package recursion;

import java.util.Scanner;

public class Pepcoding_005 {
    public static void main(String[] args) {
        int x,n;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter the power :");
        n = sc.nextInt();
        System.out.println("Power is :" + power(x, n));
        System.out.println("Log Power is :" + power(x, n));

    }

    static double power(int x, int n) {
        double res;
        if(n < 0) {
            res = 1/calculatePower(x,(-1*n));
        }
        else {
            res = calculatePower(x,n);
        }
        return res;
    }

    static double calculatePower(int x, int n) {
        if(n == 0)
            return 1;
        double res= x * calculatePower(x, n-1);
        return res;
    }

    static double logPower(int x, int n) {
        if(n == 0)
            return 1;
        if(n < 0) {
            return 1/calculateLogPower(x, (-1*n));
        }
        return calculateLogPower(x, n);
    }

    static double calculateLogPower(int x, int n) {
        if(n == 0)
            return 1;
        double res;
        if(n % 2 == 0) {
            double xpnb2 = calculatePower(x, n/2);
            res = xpnb2 * xpnb2;
        }
        else {
            double xpnb2 = calculatePower(x, n/2);
            res = xpnb2 * xpnb2 * x;
        }
        return res;
    }

}
