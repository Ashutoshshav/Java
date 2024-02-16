import java.util.*;

class pir2{
        public static void binToDec(int bin){
                int decimal = 0;
                int pow = 0;

                while(bin > 0){
                        int lastDigit = bin % 10;

                        decimal = decimal + (lastDigit * (int)Math.pow(2, pow));

                        pow++;

                        bin = bin / 10;
                }
                System.out.println(decimal);
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a Binary Number : ");
                int bin = sc.nextInt();

                binToDec(bin);
        }
}