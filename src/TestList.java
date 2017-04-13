import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by vikas.e.mishra on 1/5/2017.
 */
public class TestList {

    public static void main(String[] args) {
//        ArrayList<String> animal = new ArrayList<String>();
//        animal.add("A");
//        animal.add("A");
//        animal.add("B");
//        animal.add("B");
//        animal.add("B");
//
//        HashMap<String,Integer> hm = new HashMap<String, Integer>();
//
//        for (String a: animal) {
//            if(hm.containsKey(a)){
//                hm.put(a,hm.get(a)+1);
//            } else{
//                hm.put(a,1);
//            }
//        }
//
//        System.out.println("_+_+_+_ "+hm);

        ArrayList arrayList1 = new ArrayList();

        //Add elements to ArrayList
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");

        //create another ArrayList object
        ArrayList arrayList2 = new ArrayList();

        //Add elements to Arraylist
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        arrayList2.add("Four");
        arrayList2.add("Five");

    /*
      To copy elements of one Java ArrayList to another use,
      static void copy(List dstList, List sourceList) method of Collections class.

      This method copies all elements of source list to destination list. After copy
      index of the elements in both source and destination lists would be identical.

      The destination list must be long enough to hold all copied elements. If it is
      longer than that, the rest of the destination list's elments would remain
      unaffected.
    */

        System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);

        //copy all elements of ArrayList to another ArrayList using copy
        //method of Collections class
        Collections.copy(arrayList2,arrayList1);

    /*
      Please note that, If destination ArrayList object is not long
      enough to hold all elements of source ArrayList,
      it throws IndexOutOfBoundsException.
    */

        System.out.println("After copy, Second ArrayList Contains : " + arrayList2);
    }
     }
class ListCheck{
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        ArrayList l2=new ArrayList();
        l2=l1;
        l2.remove(0);
        System.out.println(l2);
        System.out.println(l1);
    }
}
