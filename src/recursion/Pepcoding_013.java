/**
 * find all occurences of element in an array
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_013 {
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
        int resArr [] = findAllOccurences(arr, 0, key);
        System.out.println("Indexes are :");
        for(int item: resArr){
            System.out.print(item + " ");
        }
    }

    //fsf = found so far

    public static int[] findAllOccurences(int[] arr, int idx, int key){
        int fsf = 0;
        return findAll(arr, idx, key, fsf);
    }

    public static int[] findAll(int[] arr, int idx, int key, int fsf) {
        if(idx == arr.length) {
            return new int[fsf];
        }
        if(arr[idx] == key) {
            int occ[] =  findAll(arr, idx+1, key, fsf+1);
            occ[fsf] = idx;
            return occ;
        }
        else {
            int occ[] = findAll(arr, idx+1, key, fsf);
            return occ;
        }
    }
}
