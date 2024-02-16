public class Factorial {
        static int factorial(int num){
                if(num == 1){
                        return 1;
                }
                int fact = factorial(num - 1) * num;

                return fact;
        }
        public static void main(String[] args) {
                int num = 10;

                System.out.println(factorial(num));
        }
}