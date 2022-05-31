package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListCollection {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };
    
        for(int row=0; row<arr.length; ++row) {
            for(int col=0; col<arr[row].length; ++col) {
                System.out.println(arr[row][col]);
            }
        }
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        arraylist.add(400);
        
        System.out.println("By Using the Iterator :");
        Iterator<Integer> itr = arraylist.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nBy using the List Iterator :");
        ListIterator<Integer> it = arraylist.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nBy using the indexes :");
        for(int i=0; i<arraylist.size(); ++i) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("\nBy using the enhanced for loop :");
        for(Integer ele: arraylist) {
            System.out.println(ele);
        }

        System.out.println("\n2D arraylist :");
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        for(int i=0; i<3; ++i) {
            twoDList.add(new ArrayList<>());
        }

        for(int i=0; i<twoDList.size(); ++i) {
            for(int j=0; j<2; ++j) {
                // System.out.println("Index is " + i + "  --  "+ j);
                twoDList.get(i).add(sc.nextInt());
            }
        }
    }
    
}
