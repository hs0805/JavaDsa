package binarySearch;
// Problem link :   https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    // Find peak element first
    // then search for target before peak element
    // then search for target after peak element using order agnostic binSearch

    private static int binSearch(int arr[], int s, int e, int target) {
        boolean isDesc = false;

        if(arr[s] > arr[e]) isDesc = true;

        while(s<=e) {
            int m = s + (e-s)/2;
            if(arr[m] == target)
                return m;
            if(isDesc) {
                if (target > arr[m])
                    e = m-1;
                else s = m+1;
            } else {
                if (target < arr[m])
                    e = m-1;
                else s = m+1;
            }
        }
        return -1;
    }

    private static int findPeakIndex(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1;

        // This gives us the peak element
        while(s < e) {
            int m = s + (e-s)/2;
            if(arr[m] < arr[m+1])
                s = m+1;
            else e = m;
        }
        int peakIndex = s;
        s = 0; e = peakIndex;

        int ans = binSearch(arr, s, peakIndex, target);
        if(ans == -1) {
            return binSearch(arr, peakIndex, arr.length-1, target);
        }
        else return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 4};
        int target = 4;
        System.out.println("Element found at : "+ findPeakIndex(arr, target));
    }
}
