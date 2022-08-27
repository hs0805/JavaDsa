/**
 * Target sum subset
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements:");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println("Enter the elements :");
        for(int i=0; i<m; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target :");
        int target = sc.nextInt();
        printSubsets(arr, 0, "", 0, target);
    }

    static void printSubsets(int arr[], int idx, String set, int sum, int target) {
        if(idx == arr.length) {
            if(target == sum) {
                System.out.print(set);
            }
            return;
        }
        if(target == sum) {
            System.out.print(set);
            return;
        }
        printSubsets(arr, idx+1, set+arr[idx]+" ", sum+arr[idx], target);
        printSubsets(arr, idx+1, set, sum, target);
    }
}


