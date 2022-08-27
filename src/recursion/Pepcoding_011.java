/**
 * find last occurence of element in an array
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_011 {
    public static void main(String[] args) {
        int n, key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Find element to be searched :");
        key = sc.nextInt();
        int lastOccurence = findLastOccurence(arr, 0, key);
        System.out.println("Last index of element in array is : " + lastOccurence);
    }


    public static int findLastOccurence(int[] arr, int idx, int key) {
        if(idx == arr.length) {
            return -1;
        }
        int lastIndex = findLastOccurence(arr, idx+1, key);
        if(lastIndex == -1) {
            if(arr[idx] == key)
                return idx;
            else
                return -1;
        }
        else {
            return lastIndex;
        }
    }
}
