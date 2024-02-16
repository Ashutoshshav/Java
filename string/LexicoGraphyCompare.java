public class LexicoGraphyCompare {
        public static void main(String[] args) {
                String array[] = {"Ashutosh" , "Ayush" ,"Manish"};

                String largest = array[0];

                //Time complexity : ((Largest Length Of String) * (number of String))
                for(int i = 0;i < array.length;i++){
                        if(largest.compareToIgnoreCase(array[i]) < 0){
                                largest = array[i];
                        }
                }
                System.out.println(largest);
        }
}
