import java.util.*;

class Pra2 {
        public static void inputArray(int array[][]){
                Scanner sc = new Scanner(System.in);

                for(int i = 0;i < array.length;i++){
                        for(int j = 0;j < array[0].length;j++){
                                System.out.print("enter a value : ");
                                array[i][j] = sc.nextInt();
                        }
                }
        }

        public static void diagonalSum(int array[][]){
                
                //non-optimised code
                /* int leftSum = 0;
                int rightSum = 0;
                for(int i = 0;i < array.length;i++){
                        for(int j = 0;j < array[0].length;j++){
                                if(i == j){
                                        leftSum = leftSum + array[i][j];
                                }
                                if((i + j) == array.length - 1){
                                        rightSum = rightSum + array[i][j];
                                }
                        }
                }
                System.out.println(leftSum);
                System.out.println(rightSum); */

                int sum = 0;
                //Optimised code
                for(int i = 0;i < array.length;i++){
                        sum += array[i][i];

                        if(i != array.length - 1 - i && i + (array.length - i - 1) == array.length - 1){
                                sum += array[i][array.length - i - 1]; 
                        }
                }

                System.out.print("Sum = " + sum);

        }

        public static void outputArray(int array[][]){
                for(int i = 0;i < array.length;i++){
                        for(int j = 0;j < array.length;j++){
                                System.out.print(array[i][j] + "        ");
                        }
                        System.out.println();
                }
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a size of array : ");
                int size = sc.nextInt();

                int array[][] = new int[size][size];

                inputArray(array);
                
                outputArray(array);
                
                diagonalSum(array);
        }
}