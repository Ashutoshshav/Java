import java.util.*;

class PairSumUnsorted {
        public static void main(String[] args) {
                ArrayList<Integer> arr = new ArrayList<>();

                arr.add(11);
                arr.add(15);
                arr.add(6);
                arr.add(8);
                arr.add(9);
                arr.add(10);

                int target = 16;

                int max = 0;
                int BP = -1;
                for(int i = 0; i < arr.size(); i++) {
                        if(arr.get(i) > arr.get(i + 1)) {
                                max = Math.max(max, arr.get(i));
                                BP = i;
                                break;
                        }
                }
                
                int RP = BP;
                int LP = BP + 1;
                while(LP != RP) {
                        if(arr.get(LP) + arr.get(RP) == target) {
                                System.out.println(LP + " " +  RP);
                                return;
                        }
                        else if(arr.get(LP) + arr.get(RP) > target) {
                                RP = (arr.size() + RP - 1) % arr.size();
                        }
                        else if(arr.get(LP) + arr.get(RP) < target) {
                                LP = (LP + 1) % arr.size();
                        }
                }
        }
}
