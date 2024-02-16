import java.util.*;

class string5{
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);

          String name = sc.nextLine();

          String result = sc.nextLine();

          for(int i = 0;i < name.length();i++){
              if(name.charAt(i) == 'e'){
                  result = result + 'i';
              } else{
                  result = result + name.charAt(i);
              }
          }
      }
}
