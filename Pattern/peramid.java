public class peramid {
        public static void main(String[] args) {
                int term = 10;

                for(int i = 1; i <= term; i++) {
                        for(int j = term; j > i; j--) {
                                System.out.print(' ');
                        }

                        for(int k = 1; k <= i; k++) {
                                System.out.print('*');
                        }

                        if(i >= 2) {
                                for(int l = 1; l < i; l++) {
                                        System.out.print('*');
                                }
                        }

                        System.out.println();
                }
        }
}