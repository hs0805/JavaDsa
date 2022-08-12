package binarySearch;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(target == arr[m]) return m;
            else if(target < arr[m]) e = m-1;
            else s = m+1;
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        boolean isAsc = arr[s] < arr[e];
        while(s <= e) {
            int m = s + (e-s)/2;
            if(target == arr[m]) return m;
            if(isAsc) {
                if(target < arr[m]) e = m-1;
                else s = m+1;
            } else {
                if(target > arr[m]) e = m-1;
                else s = m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 32, 34, 36, 45, 76};

        int descArr[] = {76, 45, 36, 34, 32, 12};
        int target = 45;

        System.out.println("Item present at : " + orderAgnosticBinarySearch(descArr, target));
        System.out.println("Item present at : " + binarySearch(arr, target));
    }
}
