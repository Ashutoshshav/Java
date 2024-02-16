class BitOddEven {
        /* if the any LSB(left significent bit) of binary number is = 0 so this number is Even
         * else LSB is = 1 so it is Odd number
         */
        public static void main(String[] args) {
                int num = 5;

                if((num & 1) == 0){
                        System.out.println("Even");
                }
                else{
                        System.out.println("Odd");
                }

                //System.out.println(6 << 2);
        }
}