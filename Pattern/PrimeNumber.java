class PrimeNumber {
        /* static boolean isPrime(int num) {
                if(num == 2) {
                        return true;
                }

                for(int i = 2; i < num; i++) {
                        if(num % i == 0) {
                                return false;
                        }
                }

                return true;
        } */

        /* optimised code */
        static boolean isPrime(int num) {
                for(int i = 2; i <= Math.sqrt(num); i++) {
                        if(num % i == 0) {
                                return false;
                        }
                }
                return true;
        }
        public static void main(String[] args) {
                System.out.println(isPrime(4));
        }
}