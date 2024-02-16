import java.util.*;

class SwapNumber {
        static void swap(ArrayList<Integer> number, int fN, int sN) {
                int temp = number.get(fN);
                number.set(fN, number.get(sN));
                number.set(sN, temp);
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                ArrayList<Integer> number = new ArrayList<>();

                number.add(45);
                number.add(37);
                number.add(65);
                number.add(42);
                number.add(25);

                System.out.println(number);

                System.out.print("Enter a first index");
                int fN = sc.nextInt();

                System.out.print("Enter a second index");
                int sN = sc.nextInt();

                swap(number, fN, sN);

                System.out.println(number);
        }
}