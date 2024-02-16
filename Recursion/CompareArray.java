public class CompareArray {
        // this program is Check array is sorted or not
        static boolean compareArray(int array[], int i){
                if(i == (array.length - 1)){
                        return true;
                }

                if(array[i] > array[i + 1]){
                        return false;
                }

                return compareArray(array, i + 1);
        }
        public static void main(String[] args) {
                int array[] = {5,8,2};

                System.out.println(compareArray(array, 0));
        }
}
