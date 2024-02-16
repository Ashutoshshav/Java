public class FirstOccurence {
        // this function is Find out the first occurence of key and return its index
        static int findKey(int array[], int i, int key) {
                if(array[i] == key){
                        return i;
                }
                if(i == array.length - 1){
                        return -1;
                }
                return findKey(array, i + 1, key);
        }
        public static void main(String[] args) {
                int array[] = {5,83,93,5,23};
                System.out.println(findKey(array, 0, 5));
        }
}
