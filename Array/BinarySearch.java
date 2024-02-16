import java.util.*;

class BinarySearch{//The time complexity of Binary Search = O(log n)
        public static void inputArray(int array[]){
                Scanner sc = new Scanner(System.in);

                System.out.println("<<<< Please enter sorted Elements >>>>");
                for(int i = 0;i < array.length;i++){
                        System.out.print("Enter a value of Index [" + i +  "] : ");
                        array[i] = sc.nextInt();
                }
        }

        public static int binarySearch(int array[], int key){
                int start = 0;
                int end = array.length - 1;

                while(start <= end){
                        int mid = (start + end) / 2;

                        //comparisons
                        if(array[mid] == key){//found
                                return mid;
                        }
                        if(array[mid] > key){//left
                                end = mid - 1;
                        }
                        else{
                                start = mid + 1;//right
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int array[] = new int[size];

                inputArray(array);

                System.out.print("Enter a Key do you want Search : ");
                int key = sc.nextInt();

                int index = binarySearch(array, key);

                if(index >= 0){
                        System.out.print(key + " is found at index [" + index + "]");
                }
                else{
                        System.out.print(key + " is not found in Array");
                }
        }
}