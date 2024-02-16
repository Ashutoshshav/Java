class BubbleSort {
        // Bubble sort Optimized Code
        public static void main(String[] args) {
                int arr[] = {5,9,4,2,5,3,4,2,10,-56,-65,-57};

                boolean check = false;
                for(int i = 0; i < arr.length - 1; i++) {
                        for(int j = 0; j < arr.length - i - 1; j++) {
                                if(arr[j] > arr[j + 1]) {
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                        check = true;
                                }
                        }
                        if(check == false) {
                                break;
                        }
                }

                for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }
}