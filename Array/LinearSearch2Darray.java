import java.util.*;

class LinearS2D{
        public static void InputArray(int row,int coloum,int array[][]){
                Scanner sc = new Scanner(System.in);
                for(int i = 0;i < row;i++){
                        for(int j = 0;j < coloum;j++){
                                array[i][j] = sc.nextInt();
                        }
                }
        }

        public static void SaerchNumber(int row,int coloum,int array[][],int number){
                for(int i = 0;i < row;i++){
                        for(int j = 0;j < coloum;j++){
                                if(array[i][j] == number){
                                        System.out.print(number + " is present in index " + i + j);
                                        break;
                                }
                        }
                }
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Row of matrix : ");
                int row = sc.nextInt();

                System.out.print("Enter a coloum of a matrix : ");
                int coloum = sc.nextInt();

                int array[][] = new int[row][coloum];
                
                InputArray(row, coloum, array);

                System.out.print("Enter a number do you want find in Array :");
                int number = sc.nextInt();

                SaerchNumber(row, coloum, array, number);
        }
}