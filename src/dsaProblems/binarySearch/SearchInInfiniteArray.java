package binarySearch;


public class SearchInInfiniteArray {

    private static int binSearch(int[] arr, int target, int s, int e) {
        while(s <= e) {
            int m = s + (e-s)/2;
            if(arr[m] == target) {
                return m;
            }
            else if(target < arr[m])
                e = m-1;
            else s = m+1;
        }
        return -1;
    }

    static int searchTarget(int[] arr, int target) {
        // Define the range first where we want to search the target in infinite array
        int s = 0;
        int e = 1;
        int windowSize;

        // This loop finds the range exponentially where our target element lies
        while(target > arr[e]) {
            windowSize = (e - s + 1);  // find the current window size
            windowSize *= 2;  // double the window size
            s = e+1;            // set new start
            e = s + windowSize;  // set new end
        }

        return binSearch(arr, target, s, e);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,8,12,23,34,56,65,76,87,89,90,91, 93, 95, 99};
        int target = 34;
        System.out.println("Element found at : "+ searchTarget(arr, target));
    }

}
