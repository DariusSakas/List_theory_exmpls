import java.util.Collections;
import java.util.*;

public class Collections_is_not_Collection implements SuppressWarningTest {

    public void checkCollectionsMethods(){
        //Collections methods:

        List<String> someListCollection = new ArrayList<>();

        Collections.addAll(someListCollection, "Liule Kebab", "Chicken Tikka");
        Collections.sort(someListCollection);

        for (String s : someListCollection) {
            System.out.println(s);
        }

        System.out.println("--------------");
        //Collection methods:
        someListCollection.add("Grikiai");

        someListCollection.sort(String.CASE_INSENSITIVE_ORDER);

        for (String s : someListCollection) {
            System.out.println(s);
        }

        System.out.println("--------------");
//
//        //Array list:
        ArrayList<Object> arrayList = new ArrayList();

        arrayList.add("My String");

        arrayList.add(1);

        arrayList.add('W');

        for (Object o : arrayList) {
            System.out.println(o);
            System.out.println(o.getClass().getSimpleName());
        }
//
//        for (Object o : arrayList) {
//            System.out.println("Calculating average:");
//            System.out.println(double avgOfValue = o / arrayList.size());
//        }

        System.out.println("--------------");
//        //Linked List:
//
//        List<String > strings = new LinkedList<>();
//        strings.add("1");
//        strings.add(1,"2");
//        strings.add("3");
//        strings.remove(2);
//
//
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//        System.out.println(strings.isEmpty());


    }
}
