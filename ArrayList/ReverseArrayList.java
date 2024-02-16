import java.util.*;

class ReverseArrayList {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> number = new ArrayList<>();
                
                /* for(int i = 0; i < number.size(); i++) {
                        System.out.print("Enter a value of index [" + i + "] : ");
                        number.get(i);
                } */

                number.add(8);
                number.add(3);
                number.add(6);
                number.add(5);
                number.add(10);

                for(int i = number.size() - 1; i >= 0; i--) {
                        System.out.print(number.get(i) + " ");
                }
                

        }
}
