package binarySearch;

public class FloorAndCeiling {
    // Ceiling ->     min(ans)>=target
    // Floor   ->     max(ans)<=target

    static int[] ceilingAndFloor(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            int m = s + (e-s)/2;
            if(target == arr[m]) {
                return new int[] {target, target};
            }
            if(target < arr[m]) {
                e = m-1;
            }
            else s = m+1;
        }

        return new int[] {arr[s], arr[e]} ;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int [] ans = ceilingAndFloor(arr, target);
        System.out.println("Ceiling of " + target + " : " + ans[0]);
        System.out.println("Floor of " + target + " : " + ans[1]);
    }
}
