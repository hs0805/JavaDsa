package ImmutableClass;

import java.util.ArrayList;

public class FinalDemo {
    // Direct Initialization
    final int id = 10;

    // Instance block initialization
    final int id2;
    {
        id2 = 20;
    }

    // Constructor initialization
    final int id3;
    FinalDemo() {
        id3 = 30;
    }

    final static int id4 ;
     // static final variable can be initialized at the time of instantiation and using static block
    static {
        id4 = 100;
    }

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
    }
}
