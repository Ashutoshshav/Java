import java.util.*;

class two_D {
        public static void main(String[] args) {
                ArrayList<ArrayList<Integer>> mainL = new ArrayList<>();

                ArrayList<Integer> list1 = new ArrayList<>();
                /* list1.add(1);
                list1.add(2);
                list1.add(3);
                list1.add(4);
                list1.add(5); */

                ArrayList<Integer> list2 = new ArrayList<>();
                /* list2.add(2);
                list2.add(4);
                list2.add(6);
                list2.add(8);
                list2.add(10); */

                ArrayList<Integer> list3 = new ArrayList<>();
                /* list3.add(3);
                list3.add(6);
                list3.add(9);
                list3.add(12);
                list3.add(15); */

                for(int i = 1; i <= 5; i++) {
                        list1.add(1 * i);
                        list2.add(2 * i);
                        list3.add(3 * i);
                }
                
                mainL.add(list1);
                mainL.add(list2);
                mainL.add(list3);

                for(int i = 0; i < mainL.size(); i++) {
                        ArrayList<Integer> currA = mainL.get(i);
                        for(int j = 0; j < currA.size(); j++) {
                                System.out.print(currA.get(j) + " ");
                        }
                        System.out.println();
                }
        }
}