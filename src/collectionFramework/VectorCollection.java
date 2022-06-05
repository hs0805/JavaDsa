package collectionFramework;

import java.util.*;

public class VectorCollection {
    public static void main(String args[]) {

    //1. Almost all methods are synchronized in vector
    //2. Size increases by 100%. Initially default size is 10;
    //3. Can be used in multi-threaded env. It doesn't ensure 100% thread-safety.
    //4. Allows duplicates insertion
    //5. null is allowed
    //6. Preserves insertion order. Ordered collection.
    //7. Underlying ds is resizable or growable array.
    //8. heterogeneous objects are allowd if declared and initialized with generic. 
    //9. It implements Serializable, Cloneable and RandomAccess interface.
    //10. Vector is best choice when frequent operation is retrieval. because methods are synchronized so writes will be slower.   
    //11. Known as Legacy class


        Vector<String> v = new Vector<>();  // Not generic
        // Vector v = new Vector();            // Generic
        v.add("Happy Singh");
        v.add("Happy Singh");
        // v.add(null);
        // v.add(5);
        for(Object s: v){
            System.out.println(s);
        }

        //With new keyword everytime new memory is allocated in heap.
        //W
        String s = new String("aadityasinha");
        String t = new String("aadityasinha");
        System.out.println(t);
        System.out.println(s.hashCode() + "  "+ t.hashCode());  // hashcode depends on content not on object
        System.out.println("Reference pointing to same object :" + (s == t)); // == checks for reference 
        System.out.println("Is content same :" + (s.equals(t))); //equals method is used for content comparison.


        //Iterating the vector:
        // System.out.println("Happy".hashCode());

        //1. Using enumeration
        System.out.println("\nUsing Enumeration :");
        Enumeration<String> e = v.elements();
        // System.out.println(e);
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        
        //2. Using iterator
        System.out.println("\nUsing iterator :");
        Iterator<String> itr = v.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //3. Using List iterator
        System.out.println("\nUsing List Iterator :");
        ListIterator<String> it = v.listIterator();   // Bi-directional iterator and comes with previous function
        while(it.hasNext()) {
            
            System.out.println(it.next());
        }

        //4. Using for each loop
        System.out.println("\nUsing for each loop :");
        for(String ele: v) {
            System.out.println(ele);
        }
    }
}
