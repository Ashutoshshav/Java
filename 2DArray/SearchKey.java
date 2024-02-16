import java.util.*;

class SearchKey {
        public static boolean Search(int array[][], int key){
                int r = array.length - 1;
                int c = 0;

                while(r >= 0 && c < array[0].length){
                        if(key == array[r][c]){
                                System.out.println(key + " is found " + r + c);
                                return true;
                        }
                        else if(key > array[r][c]){
                                c++;
                        }
                        else{
                                r--;
                        }
                }
                return false;
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

                System.out.print("Enter a Key : ");
                int key = sc.nextInt();

                if(Search(array, key) == false){
                        System.out.print(key + " is not present");
                }
        }
}