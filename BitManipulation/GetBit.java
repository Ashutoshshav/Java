class BitAtIthLocation {
        /*  For Get Bit at the ith Location */
        public static void main(String[] args) {
                int i = 2;
                int num = 5;

                if((num & (1 << i)) == 0){
                        System.out.println(0);
                }
                
                else{
                        System.out.println(1);
                }
        }        
}
