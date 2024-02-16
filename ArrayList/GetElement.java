import java.util.ArrayList;

public class GetElement {
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                
                list.add(2);
                list.add(5);
                list.add(3);
                list.add(4);
                list.add(8);

                System.out.println(list.get(0));
                System.out.println(list.get(1));
                System.out.println(list.get(2));
                System.out.println(list.get(3));
        }
}
