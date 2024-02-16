import java.util.*;

class Strings{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                String fullName = sc.nextLine();

                System.out.println(fullName);
                System.out.println(fullName.length());

                for(int i = 0;i < fullName.length();i++){
                        System.out.println(fullName.charAt(i));
                }
        }
}