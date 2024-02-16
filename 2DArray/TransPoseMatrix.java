class Prac1 {
        public static void main(String[] args) {
                int arr[][] = {{1,4,9},{11,4,3}};

                for(int i = 0;i < arr.length;i++) {
                        for(int j = 0;j < arr[0].length;j++) {
                                System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                } 

                System.out.println();
                
                int transpose[][] = new int[3][2];
                for(int i = 0;i < arr.length;i++) {
                        for(int j = 0;j < arr[0].length;j++) {
                                transpose[j][i] = arr[i][j];
                        }
                }
                
                for(int i = 0;i < transpose.length;i++) {
                        for(int j = 0;j < transpose[0].length;j++) {
                                System.out.print(transpose[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
