import java.util.*;

public class MapDEmo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"wer");
        map.put(1,"abc");// it updates the value in the 1 index
        map.put(2,"fateh");
        map.putIfAbsent(2,"Anhad"); //it doesnt overwrite the value bcoz we use putifabsent
        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values(); //these are used to get the values separately means mapping will distrub


        System.out.println(map.get(2));
        System.out.println(map);
        Set<Map.Entry<Integer,String >>entries=map.entrySet();
        Iterator<Map.Entry<Integer,String>>iterator= entries.iterator(); //iterator is used for mapping it will not distrub the mapping
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }
        }
    }

