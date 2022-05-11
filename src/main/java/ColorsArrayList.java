
import java.util.Iterator;
import java.util.ArrayList;
import  java.util.List;

public class ColorsArrayList {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Pink");
        list.add("Orange");
        //size of the list
        System.out.println("Number of elements in the arraylist is: "+list.size());
        //print the list
        System.out.println(list);
        //using iterator to traverse every element in the collection
        Iterator iterator=list.iterator();

        while (iterator.hasNext())
        //advanced for loop
        for(String s : list)
        {
            System.out.println(s);

    }
        // Add element in the first position
        list.add(0,"White");
        System.out.println(list);
        //Retrieve an element from the given position
        System.out.println(list.get(4));
        //update an array element
        list.set(3,"Purple");
        System.out.println(list);
        //Remove an array element at the given index
        list.remove(2);
        System.out.println(list);
}}
