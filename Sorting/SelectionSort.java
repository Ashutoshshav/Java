class SelectionSort {
        public static void main(String[] args) {
                int arr[] = {5,2,6,7,12,1};

                int min = Integer.MAX_VALUE;

                for(int i = 0; i < arr.length - 1; i++) {
                        int index = i;
                        for(int j = i + 1;j < arr.length; j++) {
                                if(arr[j] < arr[i]) {
                                        index = j;
                                }
                        }
                        int temp = arr[i];
                        arr[i] = arr[index];
                        arr[index] = temp;
                }

                for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }
}