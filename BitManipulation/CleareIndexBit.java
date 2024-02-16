public class CleareIndexBit {
        public static void clearBitsInRange(int num,int i,int j){
                int a = (0 << (j+1));
                int b = (1 << i) - 1;

                int bitMask = a | b;

                System.out.println(num & bitMask);
        }
        public static void main(String[] args) {
                clearBitsInRange(10, 2, 4);
        }
}
