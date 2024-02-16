class ClearBit {
        /* For Cleare 1 and set 0 at ith Location */
        public static void main(String[] args) {
                int num = 10;
                int i = 1;

                System.out.println(num & (~(1 << i)));
        }        
}
