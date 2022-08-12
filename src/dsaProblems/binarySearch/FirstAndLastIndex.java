//  Problem link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package binarySearch;

public class FirstAndLastIndex {

    class Solution {

        public int[] searchRange(int[] nums, int target) {
            int ans[] = {-1, -1};
            int firstIndex = search(nums, target, true);
            int lastIndex = search(nums, target, false);

            ans[0] = firstIndex;
            ans[1] = lastIndex;

            return ans;
        }

        public int search(int[] arr, int target, boolean isFirstIndex) {
            int s = 0;
            int e = arr.length - 1;
            int ans = -1;
            while(s <= e) {
                int m = s + (e-s)/2;

                if(target == arr[m]) {
                    ans = m;
                    if(isFirstIndex) {
                        e = m-1;
                    }
                    else s = m+1;
                }
                else if(target < arr[m]) {
                    e = m-1;
                }
                else s = m+1;
            }
            return ans;
        }
    }

}
