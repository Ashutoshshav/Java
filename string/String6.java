import java.util.*;

class string6{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                String name = sc.nextLine();

                String result = "";

                for(int i = 0;i < name.length();i++){
                        if(name.charAt(i) == 'e'){
                                result += 'i';
                        } else{
                                result += name.charAt(i);
                        }
                }

                System.out.print(result);
        }
}

