import java.util.*;

public class string7 {
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                String email = sc.nextLine();

                String name = "";
                for(int i = 0;i < email.length();i++){
                        if(email.charAt(i) == '@'){
                                break;
                        } else{
                                name = name + email.charAt(i);
                        }
                }

                System.out.print(name);
        }
}
