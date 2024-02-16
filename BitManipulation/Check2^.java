class Check2Power {
        /* Check is number power of 2 or not */

        public static boolean Check2Power(int num){
                return (num & (num - 1)) == 0;
        }
        public static void main(String[] args) {
                System.out.println(Check2Power(16));
        }      
}
