import java.util.ArrayList;
import java.util.Collections;

class SortingArrayList {
        public static void main(String[] args) {
                ArrayList<Integer> number = new ArrayList<>();

                number.add(36);
                number.add(15);
                number.add(30);
                number.add(28);
                number.add(35);
                number.add(29);

                Collections.sort(number);// for acending order sorting

                System.out.println(number);

                Collections.sort(number, Collections.reverseOrder()); // for decending order sorting

                System.out.println(number);
        }
}
