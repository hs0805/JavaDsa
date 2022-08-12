package linearSearch;

import java.util.Arrays;

public class LinearSearch2D {

    static int maxValue(int[][] arr) {
        int maxEle = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > maxEle)
                    maxEle = arr[row][col];
            }
        }
        return maxEle;
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;

        int[] ans = searchIn2DArray(arr, target);

        System.out.println("Found at :" + Arrays.toString(ans));

        System.out.println("Max element : "+ maxValue(arr));
    }


}
