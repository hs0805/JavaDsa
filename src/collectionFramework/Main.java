package collectionFramework;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //datatype[] variable = new datatype[size];
        int[] rnos = new int[5];
        // int[] rnos1 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; ++i) {
            rnos[i] = sc.nextInt();
        }
        for(int i=0; i<rnos.length; ++i) {
            System.out.println("item is : " + rnos[i]);
        }
    }
}
