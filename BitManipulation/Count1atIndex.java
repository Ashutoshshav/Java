public class Count1atIndex {
        public static int Count1atIndex(int num){
                int counter = 0;

                while(num > 0){
                        if((num & (1 << 0)) == 1){
                                counter++;
                        }
                        num = num >> 1;
                }
                return counter;
        }
        public static void main(String[] args) {
                System.out.println(Count1atIndex(16));
        }
}
