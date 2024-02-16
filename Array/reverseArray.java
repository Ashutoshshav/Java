import java.util.*;

class Pric{
        public static void inputArray(int array[]){
                Scanner sc = new Scanner(System.in);
                
                for(int i = 0;i < array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        array[i] = sc.nextInt();
                }
        }

        public static void reverseArray(int array[]){
                int temp;
                for(int i = 0;i < array.length / 2;i++){
                        temp = array[i];
                        array[i] = array[array.length - 1 - i];
                        array[array.length - 1 - i] = temp;
                }
        }

        public static void printArray(int array[]){
                for(int i = 0;i < array.length;i++){
                        System.out.print(array[i] + "   ");
                }
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int array[] = new int[size];

                inputArray(array);

                reverseArray(array);

                printArray(array);
        }
}