class QuickSort {
        static void quickSort(int arr[], int si, int ei) {
                if(si >= ei) {
                        return;
                }
                
                int pInx = findIndex(arr, si, ei);

                quickSort(arr, si, pInx - 1);
                quickSort(arr, pInx + 1, ei);
        }

        static int findIndex(int arr[], int si, int ei) {
                int i = si - 1;
                int pivot = arr[ei];
                for(int j = si; j < ei; j++) {
                        if(arr[j] < pivot) {
                                i++;
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                        }
                }

                i++;
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;

                return i;
        }

        public static void main(String args[]) {
                int arr[] = {5,2,4,8,3,6,10,-5};

                quickSort(arr, 0, arr.length - 1);

                for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }        
}
