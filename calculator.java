import java.util.*;

class Calculator {
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a First number : ");
                int a = sc.nextInt();
                
                System.out.print("Enter a Operator : ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter a Second number : ");
                int b = sc.nextInt();

                switch(operator){
                        case '+' : {
                                System.out.println("Sum : " + (a+b));
                                break;
                        }

                        case '-' : {
                                System.out.println("Subtract : " + (a-b));
                                break;
                        }

                        case '*' : {
                                System.out.println("Multiply : " + (a*b));
                                break;
                        }

                        case '/' : {
                                System.out.println("Divide : " + (a/b));
                                break;
                        }

                        case '%' : {
                                System.out.println("Modulo : " + (a%b));
                                break;
                        }
                }
        }
}