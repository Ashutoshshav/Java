import java.util.*;
class Prac{
        public static void inputArray(int array[]){
                Scanner sc = new Scanner(System.in);

                for(int i = 0;i < array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        array[i] = sc.nextInt();
                }
        }

        public static void subArray(int Array[]){
                for(int i = 0;i < Array.length;i++){
                        for(int j = i;j < Array.length;j++){
                                for(int k = i;k <= j;k++){
                                        System.out.print(Array[k] + " ");
                                }
                                System.out.println();
                        }
                        System.out.println();
                }
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int array[] = new int[size];

                inputArray(array);

                subArray(array);
        }
}