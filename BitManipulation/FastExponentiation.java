public class FastExponentiation {
        /* For calculate Exponentiation in less time complexity */
        public static int exponentiation(int num, int n){
                int ans = 1;
                while(n > 0){
                        if((n & 1) == 1){
                                ans = ans * num;
                        }
                        num = num * num;
                        n = n >> 1;
                }
                return ans;
        }
        public static void main(String[] args) {
                System.out.println(exponentiation(5, 10));
        }
}
