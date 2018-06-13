package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String [] args){

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Lion");
        arrayList.add("Tiger");
        arrayList.add("Hippo");
        arrayList.add("Rhino");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Lion");
        linkedList.add("Tiger");
        linkedList.add("Hippo");
        linkedList.add("Rhino");

        printList(arrayList);
        printList(linkedList);
    }

    public static void printList(List<String> list){
        for(String val : list)
            System.out.println(val);

    }

}
