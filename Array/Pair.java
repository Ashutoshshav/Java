import java.util.*;

class Pro{
        public static void inputArray(int Array[]){
                Scanner sc = new Scanner(System.in);

                for(int i = 0;i < Array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        Array[i] = sc.nextInt();
                }
        }

        public static void pairArray(int Array[]){
                for(int i = 0;i < Array.length;i++){
                        for(int j = i + 1;j < Array.length;j++){
                                System.out.print("(" + Array[i] + "," + Array[j] + ")   ");
                        }
                        System.out.println();
                }
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int Array[] = new int[size];

                inputArray(Array);

                pairArray(Array);
        }
}