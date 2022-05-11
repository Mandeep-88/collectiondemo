import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
    public static void main(String[] args) {
        Set <Employee> set1= new TreeSet<>();
        Set<String>set = new TreeSet<>();
        //treeset
//        TreeSet<Employee> set2= new TreeSet<Employee>();
//        Employee e1= new Employee ("Mandeep",29);
//        set2.add(e1);
//        Employee e2 = new Employee("Fateh",10);
//        set2.add(e2);
//        System.out.println(set2.comparator());

        //TREESET
        Set<Integer> set3 = new TreeSet<>();
        set3.add(44);
        set3.add(55);
        set3.add(26);
        Iterator iterator = set3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set3);

    }
//    Set<Person> set4= new TreeSet<>();
//    set4.add(new Person(32));
//    set4.add(new Person(36));
//    set4.add(10);
//    set4.add(6);

}
 class Person implements Comparable<Person> {
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    private int age;

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}