class EqualString {
        public static void main(String[] args) {
                String str = "Tony";
                String str2 = "Tony";

                String str3 = new String("Tony");

                if(str.equals(str3)){
                        System.out.println(true);
                }
                else{
                        System.out.println(false);
                }
        }
}