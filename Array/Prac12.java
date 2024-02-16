class Prac12 {
        
        public static void main(String[] args) {
                int matrix[][] = {{10,25,53,45},{56,18,42,45},{64,96,25,78}};

                int startRow = 0;
                int endRow = matrix.length - 1;

                int startColoum = 0;
                int endColoum = matrix[0].length - 1;

                while(startColoum <= endColoum && startRow <= endRow){
                        for(int i = startColoum;i <= endColoum;i++){
                                System.out.print(matrix[startRow][i] + " ");
                        }

                        for(int i = startRow + 1;i <= endRow;i++){
                                System.out.print(matrix[i][endColoum] + " ");
                        }

                        for(int i = endColoum - 1;i >= startColoum;i--){
                                System.out.print(matrix[endRow][i] + " ");
                        }

                        for(int i = endRow - 1;i >= startRow + 1;i--){
                                System.out.print(matrix[i][startColoum] + " ");
                        }

                        startColoum++;
                        startRow++;
                        endColoum--;
                        endRow--;
                }

                System.out.println();

                for(int i = 0;i < matrix.length;i++){
                        for(int j = 0;j < matrix[0].length;j++){
                                System.out.print(matrix[i][j] + "       ");
                        }
                        System.out.println();
                }
        }
}