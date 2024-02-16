import java.util.*;

class TrappedWaterArrayList {
        public static void main(String[] args) {
                ArrayList<Integer> arr = new ArrayList<>();

                arr.add(1);
                arr.add(8);
                arr.add(6);
                arr.add(2);
                arr.add(5);
                arr.add(4);
                arr.add(8);
                arr.add(3);
                arr.add(7);

                int maxWater = 0;

                //its code TimeC is O(n^2)
                /* for(int i = 0; i < arr.size(); i++) {
                        for(int j = i + 1; j < arr.size(); j++) {
                                int height = Math.min(arr.get(i), arr.get(j));
                                int width = j - i;

                                int trappWater = height * width;

                                maxWater = Math.max(maxWater, trappWater);
                        }
                } */

                int LP = 0;
                int RP = arr.size() - 1;

                // its TimeC is O(n)
                while(LP < RP) {
                        int height = Math.min(arr.get(LP), arr.get(RP));
                        int width = RP - LP;

                        int trappWater = height * width;

                        maxWater = Math.max(maxWater, trappWater);

                        if(arr.get(LP) < arr.get(RP)) {
                                LP++;
                        }
                        else if(arr.get(LP) >= arr.get(RP)) {
                                RP--;
                        }
                }

                System.out.println(maxWater);
        }
}