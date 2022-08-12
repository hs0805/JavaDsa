package binarySearch;

public class FindPeakInMountainArray {

    static int findPeakElementInMountainArray ( int[] nums){
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] < nums[m + 1])
                s = m + 1;
            else e = m;
        }
        return s;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int target = 34;
        System.out.println("Element found at : "+ findPeakElementInMountainArray(arr));
    }
}
