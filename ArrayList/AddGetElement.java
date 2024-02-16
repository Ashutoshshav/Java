import java.util.ArrayList;

public class AddGetElement {
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                
                // for add element in ArrayList on last index

                list.add(8);
                list.add(10);
                list.add(5);
                list.add(9);
                list.add(7);

                System.out.println(list);

                // for get element in ArrayList using index

                System.out.println(list.get(0));
                System.out.println(list.get(1));
                System.out.println(list.get(2));
                System.out.println(list.get(3));

                // for print ArrayList

                System.out.println(list);
        }
}
