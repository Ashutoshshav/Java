class MergeSort {
        static void mergeSort(int array[], int si, int ei) {
                if(si < ei) {
                
                        int mid = (si + ei) / 2;

                        mergeSort(array, si, mid);
                        mergeSort(array, mid + 1, ei);

                        merge(array, si, mid, ei);

                }
        }

        static void merge(int array[], int si, int mid, int ei) {
                int temp[] = new int[ei - si + 1];

                int i = si;
                int j = mid + 1;
                int k = 0;

                while(i <= mid && j <= ei) {
                        if(array[i] < array[j]) {
                                temp[k] = array[i];
                                k++;
                                i++;
                        }
                        else {
                                temp[k] = array[j];
                                k++;
                                j++;
                        }
                }

                while(i <= mid) {
                        temp[k] = array[i];
                        i++;
                        k++;
                }

                while(j <= ei) {
                        temp[k] = array[j];
                        k++;
                        j++;
                }

                for(k = 0, i = si;k < temp.length;k++, i++) {
                        array[i] = temp[k];
                }
        }
        public static void main(String[] args) {
                int array[] = {5, 6, 3, 8, 7, 1 ,-1};
                
                mergeSort(array, 0, array.length - 1);
                
                for(int i = 0;i < array.length;i++) {
                        System.out.print(array[i] + " ");
                }
        }
}