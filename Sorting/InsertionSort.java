class InsertionSort {
        public static void main(String[] args) {
                int arr[] = {4,3,8,2,4,9,-8,-45};

                for(int i = 1; i < arr.length; i++) {
                        int curr = arr[i];
                        int prev = i - 1;

                        while(prev >= 0 && arr[prev] > curr) {
                                arr[prev + 1] = arr[prev];
                                prev--;
                        }
                        arr[prev + 1] = curr;
                }

                for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }
}