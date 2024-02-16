import java.util.*;

class Pattern{
        public static void inputArray(int Array[]){
                Scanner sc = new Scanner (System.in);

                for(int i = 0;i < Array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        Array[i] = sc.nextInt();
                }
        }

        public static void largestNumber(int Array[]){
                int largest = Integer.MIN_VALUE;
                int smmalest = Integer.MAX_VALUE;

                for(int i = 0;i < Array.length;i++){
                        if(largest < Array[i]){
                                largest = Array[i];
                        }
                        if(smmalest > Array[i]){
                                smmalest = Array[i];
                        }
                }
                System.out.println("Smallest value in Array is " + smmalest);
                System.out.println("Largest value in Array is " + largest);
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int Array[] = new int[size];

                inputArray(Array);

                largestNumber(Array);
        }
}