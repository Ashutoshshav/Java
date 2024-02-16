import java.util.*;

public class SubString {
        // For print SubString
        public static void SubString(String str,int Si,int Ei){
                for(int i = Si;i < Ei;i++){
                        System.out.print(str.charAt(i));
                }
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter a String : ");
                String str = sc.nextLine();

                System.out.print("Enter a Starting Index : ");
                int Si = sc.nextInt();

                System.out.print("Enter a Ending index : ");
                int Ei = sc.nextInt();

                //SubString(str, Si, Ei);

                // By inbuilt function
                System.out.println(str.substring(Si, Ei)); 
                System.out.println(str.substring(Si));
        }
}
