/**
 * Print an array in reverse
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_009 {
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

        printArr(arr, 0);
    }

    public static void printArr(int[] arr, int idx) {
        if(idx == arr.length) return;
        printArr(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }
}
