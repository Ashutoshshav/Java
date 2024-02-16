public class SumNumber {
        static int sumNumber(int num) {
                if(num == 1){
                        return 1;
                }
                int totalSum = num + sumNumber(num - 1);

                return totalSum;
        }
        public static void main(String[] args) {
                int n = 5;

                System.out.println(sumNumber(n));
        }
}
