class LastOccurence {
        static int lastOccurence(int array[], int i, int key) {
                if(array[i] == key) {
                        return i;
                }

                if(i == 0){
                        return -1;
                }

                return lastOccurence(array, i - 1, key);
        }
        public static void main(String[] args) {
                int array[] = {8,3,6,9,5,10,2,5,3};   
                
                System.out.println( lastOccurence(array, array.length - 1, 5));
        }
}