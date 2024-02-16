import java.nio.channels.Pipe;
import java.util.*;

class LonelyNumber {
        public static void main(String[] args) {
                ArrayList<Integer> nums = new ArrayList<>();
                
                nums.add(5);
                nums.add(15);
                nums.add(7);
                nums.add(8);
                nums.add(9);
                
                
                ArrayList<Integer> num = new ArrayList<>();
                for(int i = 0; i < nums.size(); i++) {
                        int j = i;
                        while(j != j - 1) {
                                int plus = nums.get(i) + 1;
                                int min = nums.get(i) - 1;

                                if(nums.get(j) != plus || nums.get(j) != min || nums.get(j) != nums.get(i)) {

                                }




                                j = (j + 1) % nums.size(); 
                        }
                }
        }
}
