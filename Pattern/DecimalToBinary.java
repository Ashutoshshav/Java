import java.util.*;

class DecimalToBinary{
        public static void decToBin(int dec){
                int pow = 0;
                int lastDigit = 0;

                while(dec > 0){
                        int remainder = dec % 2;

                        lastDigit = lastDigit + (remainder * (int)Math.pow(10, pow));

                        pow++;

                        dec = dec / 2;
                }
                System.out.println(lastDigit);
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a Decimal Number : ");
                int decimal = sc.nextInt();

                decToBin(decimal);
        }
}