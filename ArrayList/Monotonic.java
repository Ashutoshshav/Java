import java.util.*;
class Monotonic {
        public static void main(String[] args) {
                ArrayList<Integer> nums = new ArrayList<>();

                nums.add(1);
                nums.add(2);
                nums.add(5);
                nums.add(3);
                nums.add(6);
                nums.add(9);

                boolean check = false;

                for(int i = 0; i < nums.size() - 1; i++) {
                        if(nums.get(i) <= nums.get(i + 1)) {
                                check = true;
                        }
                        else {
                                check = false;
                                break;
                        }                         
                }

                System.out.println(check);
        }
}
