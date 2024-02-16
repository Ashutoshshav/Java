import java.util.*;

class ArrayMinMax{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int array[] = new int[size];

                for(int i = 0;i < size;i++){
                        System.out.print("Enter a number : ");
                        array[i] = sc.nextInt();
                }

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int i = 0;i < size;i++){

                        if(array[i] < min){
                                min = array[i];
                        }

                        if(array[i] > max){
                                max = array[i];
                        }
                }
                System.out.println(min + " is minimum value in Array");
                System.out.print(max + " is miximun value in Array");
        }
}