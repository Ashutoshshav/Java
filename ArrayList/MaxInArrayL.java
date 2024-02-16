import java.util.*;

class MaxInArrayL {
        public static void main(String[] args) {
                ArrayList<Integer> number = new ArrayList<>();

                number.add(8);
                number.add(95);
                number.add(68);
                number.add(85);
                number.add(10);

                int max = Integer.MIN_VALUE;

                for(int i = 0; i < number.size(); i++) {
                        /* if(number.get(i) > max) {
                                max = number.get(i);
                        } */
                        max = Math.max(max, number.get(i));
                }

                System.out.println(max);
        }
}
