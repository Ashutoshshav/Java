public class IncresingOrder {
        //For print number int Incresing Order by recursion
        static void incresingOrder(int n){
                if(n == 1){
                        System.out.print(1 + " ");
                        return;
                }
                incresingOrder(n - 1);
                System.out.print(n + " ");
        }
        public static void main(String[] args) {
                int n = 45;

                incresingOrder(n);
        }
}
