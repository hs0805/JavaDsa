/**
 * find maximum element in an array
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_010 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;++i) {
            arr[i] = sc.nextInt();
        }

        int max = findMax(arr, 0);
        System.out.println("Maximum element in array is : " + max);
    }

    public static int findMax(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        int maxInSmaller = findMax(arr, idx+1);
        if(arr[idx] < maxInSmaller){
            return maxInSmaller;
        }
        else {
            return arr[idx];
        }
    }
}
