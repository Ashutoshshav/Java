// this program is print the indexes of a given number in Array
class veriiy {
        static void printIndex(int arr[], int target, int index) {
                if(index == arr.length) {
                        return;
                }
                if(arr[index] == target) {
                        System.out.print(index + " ");
                }

                printIndex(arr, target, index + 1);
        }
        public static void main(String[] args) {
                int arr[] = {1,2,3,9,8,2,8};

                printIndex(arr, 2, 0);
        }
}
