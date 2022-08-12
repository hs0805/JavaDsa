package linearSearch;

import java.util.Arrays;

public class LinearSearch {

    static int searchInArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    static int searchInString(String str, char target) {
        System.out.println(Arrays.toString(str.toCharArray()));
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        if (end > arr.length) return -1;
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    static int minNum(int[] arr) {
        int minEle = Integer.MIN_VALUE;
        for(int item: arr) {
            if(minEle > item)
                item = minEle;
        }
        return minEle;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 34, 57, 78, 1};
        System.out.println(searchInArray(arr, 57));

        String str = "Happy Singh";
        System.out.println(searchInString(str, 'S'));

        System.out.println(searchInRange(arr, 2, 4, 57));

        System.out.println(minNum(arr));
    }
}
