// import ArrayList Package
import java.util.ArrayList;

public class Intro {
        public static void main(String[] args) {
                // for implement ArrayList
                // ArrayList <classType> name = new ArrayList<>();
                // className will be "Integer, String, Boolean, Float" etc.
                ArrayList<Integer> list = new ArrayList<>();

                // for add element in last index in ArrayList
                // name.add(value);
                list.add(8);
                list.add(10);
                list.add(6);
                list.add(4);
                list.add(34);

                System.out.println(list);

                // for get element name.get(index);
                System.out.println(list.get(1));

                // for remove element name.remove(index);
                list.remove(2);
                System.out.println(list);

                // for set element at index removing previous element
                list.set(3, 7);

                System.out.println(list);
        }
}
