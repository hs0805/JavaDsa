// Problem link :  https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package binarySearch;

public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int n = letters.length;
        int e = letters.length - 1;

        while(s <= e) {
            int m = s + (e-s)/2;

            if(target < letters[m]) e = m-1;
            else s = m+1;
        }
        Math.sqrt(20);
        return letters[s%n];
    }
}
