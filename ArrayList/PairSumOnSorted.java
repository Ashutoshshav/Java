import java.util.*;

// return indexes if index values sum is == target
class PairSumOnSorted {
        public static void main(String[] args) {
                ArrayList<Integer> arr = new ArrayList<>();

                arr.add(1);
                arr.add(2);
                arr.add(3);
                arr.add(4);
                arr.add(5);
                arr.add(6);

                int target = 5;

                // its TimeC is O(n^2)
                /* for(int i = 0; i < arr.size(); i++) {
                        for(int j = i + 1; j < arr.size(); j++) {
                                if(arr.get(i) + arr.get(j) == target) {
                                        System.out.println(i + " " + j);
                                }
                        }
                }

                System.out.println(); */

                int LP = 0;
                int RP = arr.size() - 1;

                //Its TimeC is O(n)
                while(LP < RP) {
                        if(arr.get(LP) + arr.get(RP) == target) {
                                System.out.println(LP + " " + RP);
                                return;
                        }
                        else if(arr.get(LP) + arr.get(RP) < target) {
                                LP++;
                        }
                        else if(arr.get(LP) + arr.get(RP) > target) {
                                RP--;
                        }
                }
        }
}
