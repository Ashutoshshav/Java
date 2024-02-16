import java.util.*;

class Stirngss{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a first string : ");
                String firstName = sc.nextLine();

                System.out.print("Enter a second string : ");
                String secondName = sc.nextLine();

                if(firstName.compareTo(secondName) == 0){
                        System.out.print(firstName + " is equal to " + secondName);
                } else{
                        System.out.print(firstName + " is not equal to " + secondName);
                }
        }
}