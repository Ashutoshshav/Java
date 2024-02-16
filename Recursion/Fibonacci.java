public class Fibonacci {
        //This program returns Nth Fabonacci number
        static int fibonacci(int num) {
                if(num == 0){
                        return 0;
                }
                if(num == 1){
                        return 1;
                }
                int sum = fibonacci(num - 1) + fibonacci(num - 2);

                return sum;
        }
        public static void main(String[] args) {
                int num = 25;

                System.out.println(fibonacci(9));
                System.out.println(fibonacci(25));
                System.out.println(fibonacci(26));
                System.out.println(fibonacci(27));
                System.out.println(fibonacci(28));
        }
}
