class ArrayBacktrack {
        static void arrayInput(int array[], int i, int val) {
                if(i == array.length) {
                        return;
                }
                
                array[i] = val;
                
                arrayInput(array , i + 1, val + 1);
                array[i] = array[i] - 2;
        }
        public static void main(String[] args) {
                int array[] = new int[5];

                arrayInput(array, 0, 1);

                for(int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
        }
}
