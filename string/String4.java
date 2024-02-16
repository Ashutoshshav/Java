import java.util.*;
// for calculate number of characters in Sting
class String4{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a size of Array : ");
                int size = sc.nextInt();

                String array[] = new String[size];

                int counter = 0;

                /* int i = 0;
                do{
                        array[i] = sc.nextLine();

                        counter = counter + array[i].length();
                        i++;
                }while(i < size); */
                
                for(int i = 0;i < size;i++){
                        array[i] = sc.nextLine();

                        counter = counter + array[i].length();
                }

                System.out.print(counter);
        }
}