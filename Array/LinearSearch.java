import java.util.*;

class LinearSearch{
        public static void inputArray(int Array[]){
                Scanner sc = new Scanner(System.in);

                for(int i = 0;i < Array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        Array[i] = sc.nextInt();
                        
                }
        }

        public static int linearSearch(int Array[],int key){
                for(int i = 0;i < Array.length;i++){
                        if(Array[i] == key){
                                return i;
                        }
                }
                return -1;
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int Array[] = new int[size];

                inputArray(Array);

                System.out.print("Enter a key : ");
                int key = sc.nextInt();

                int value = linearSearch(Array, key);

                if(value == -1){
                        System.out.print(key + " is not found");
                }
                else{
                        System.out.println(key + " is found at index [" + value + "]");
                }
        }
}