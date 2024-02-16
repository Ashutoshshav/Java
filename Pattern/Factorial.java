import java.util.*;
class Ashuu{
        public static void main(String[] args){

               Scanner sc = new Scanner(System.in);

               System.out.print("Enter a number : ");
               int number = sc.nextInt();

               int fact = 1;
                for(int i = 1;i <= number;i++){
                        fact = fact * i;
                }
                System.out.print("Factorial of " + number + " = " + fact);
        }
}