package binarySearch;


public class PeakInSortedRotatedBS {

    private static int findPivot(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e ) {
            int m =  s + (e-s)/2;
            if((m<e) && (arr[m] > arr[m+1])) {
                return m;
            }
            else if((m>s) && (arr[m-1] > arr[m]))
                return m-1;
            else if(arr[s] >= arr[m])
                e = m-1;
            else if(arr[s] < arr[m])
                s = m+1;
        }
        return -1;
    }

    static int binarySearchEle(int[] arr, int target, int s, int e) {
        while(s <= e) {
            int m = s + (e-s)/2;
            if(target == arr[m]) return m;
            else if(target < arr[m]) e = m-1;
            else s = m+1;
        }
        return -1;
    }

    static int searchTargetInSortedRotatedArr(int arr[], int target) {
        int pivot = findPivot(arr);
        System.out.println("pivot found at :" + pivot);
        int s = 0;
        int e = arr.length-1;
        if(pivot == -1)    // array is not rotated
            return binarySearchEle(arr, target, s, e);
        if(arr[pivot] == target)
            return pivot;
        else if(target >= arr[s])
            return binarySearchEle(arr, target, s, pivot-1);
        else if(target < arr[s])
            return binarySearchEle(arr, target, pivot+1, e);
        else
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 1;
        System.out.println("Element found at : "+ searchTargetInSortedRotatedArr(arr, target));
    }
}
