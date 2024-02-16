import java.util.*;

class pric2{
        public static void inputArray(int array[]){
                Scanner sc = new Scanner(System.in);
                for(int i = 0;i < array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        array[i] = sc.nextInt();
                }
        }

        public static void sumSubArray(int array[]){
                int max = Integer.MIN_VALUE;
                int sum = 0;
                for(int i = 0;i < array.length;i++){
                        for(int j = i;j < array.length;j++){
                                for(int k = i;k <= j;k++){
                                        System.out.print(array[k] + " ");
                                        sum = sum + array[k];
                                }
                                System.out.print("  Sum = " + sum);
                                if(sum > max){
                                        max = sum;
                                }
                                System.out.println();
                                sum = 0;
                        }
                        System.out.println();
                }
                System.out.println("Max sum = " + max);
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a size of Array : ");
                int size = sc.nextInt();

                int array[] = new int[size];

                inputArray(array);

                sumSubArray(array);
        }
}