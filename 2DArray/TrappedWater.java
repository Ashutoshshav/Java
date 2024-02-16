import java.util.*;

class TrappedWater{
        public static void inputArray(int array[]){
                Scanner sc = new Scanner(System.in);

                for(int i = 0;i < array.length;i++){
                        System.out.print("Enter a value of index [" + i + "] : ");
                        array[i] = sc.nextInt();
                }
        }

        //for calculate left max value in array1
        public static void leftMaximum(int array1[],int array2[]){
                for(int i = 0;i < array1.length;i++){
                        if(i == 0){
                                array2[i] = array1[i];
                        }
                        else if(array1[i] >= array2[i - 1]){
                                array2[i] = array1[i];
                        }
                        else if(array1[i] < array2[i - 1]){
                                array2[i] = array2[i - 1];
                        }
                }
        }

        //for calculate right max value in array2
        public static void rigthMaximum(int array1[], int array2[]){
                for(int i = array1.length - 1;i >= 0;i--){
                        if(i == array1.length - 1){
                                array2[i] = array1[i];
                        }
                        else if(array1[i] >= array2[i + 1]){
                                array2[i] = array1[i];
                        }
                        else if(array1[i] < array2[i + 1]){
                                array2[i] = array2[i + 1];
                        }
                }
        }

        //calculate minimum of leftmax and rightmax values one by one
        public static void calculateMinimum(int array1[], int array2[], int array3[]){
                for(int i = 0;i < array1.length;i++){
                        if(array1[i] <= array2[i]){
                                array3[i] = array1[i];
                        }
                        else{
                                array3[i] = array2[i];
                        }
                }

        }

        //for calculate trapped water using (minof(leftmax and rightmax value) - buildingHeight(arrayElementLength))
        public static int waterLevel(int array1[], int array3[]){
                int sum = 0;
                for(int i = 0;i < array1.length;i++){
                        array3[i] = array3[i] - array1[i];
                        sum = sum + array3[i];
                }
                return sum;
        }
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Size of Array : ");
                int size = sc.nextInt();

                int array1[] = new int[size];

                inputArray(array1);

                int array2[] = new int[size];

                leftMaximum(array1, array2);

                int array3[] = new int[size];

                rigthMaximum(array1, array3);

                calculateMinimum(array2, array3, array3);
                
                System.out.println("Trapped Water = " + waterLevel(array1, array3));

                for(int j = 0;j < array1.length;j++){
                        System.out.print(array1[j] + "   ");
                }
        }
}