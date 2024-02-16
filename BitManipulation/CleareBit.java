public class CleareBit {
        /* Cleare all bit at index i */
        public static void main(String[] args) {
                /* int num = 7;
                for(int i = 1;i <= 2;i++){
                        num = (num & ((-1) << i));
                }
                System.out.println(num); */

                int num = 7;
                int i = 2;

                System.out.println(num & (-1 << i));
        }
}