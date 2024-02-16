public class HalfPeramid {
        // O(n^2)
        public static void main(String[] args) {
                int term = 10;

                for(int i = 1; i <= term; i++) {
                        for(int j = term; j > i; j--) {
                                System.out.print(" ");
                        }
                        for(int k = 1; k <= i; k++) {
                                System.out.print('*');
                        }
                        System.out.println();
                }
        }
}
