class CharPeramid{
        //Not fully sucessful
        public static void main(String[] args) {
                //char a = 'A';
                for(char i = 'A';i <= 'G';i++){
                        for(char j = 'F';j >= i;j--){
                                System.out.print(" ");
                        }
                        for(char l = 'A';l <= i;l++){
                                System.out.print(l);
                        }
                        if(i >= 'B'){
                                for(char k = i;k >= 'A';k--){
                                        System.out.print(k);
                                }
                        }
                        System.out.println();
                }
        }
}