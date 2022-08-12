package binarySearch;

public class FindRotationCount {
    public static int rotationCount(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e ) {
            int m =  s + (e-s)/2;
            if((m<e) && (arr[m] > arr[m+1])) {
                return m+1;
            }
            else if((m>s) && (arr[m-1] > arr[m]))
                return m-1;
            else if(arr[s] >= arr[m])
                e = m-1;
            else if(arr[s] < arr[m])
                s = m+1;
        }
        return arr.length;    // it means that array is not rotated at all
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,2,3,4,5};
        System.out.println("Rotation count is : " + rotationCount(arr));
    }
}
