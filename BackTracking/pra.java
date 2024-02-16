class pra1 {
        static void printString(String str, StringBuilder ans, int i) {
                if(i == str.length()) {
                        if(ans.length() == 0) {
                                System.out.println("null");
                                return;
                        }
                        System.out.println(ans);
                        return;
                }

                //Yes
                printString(str, ans.append(str.charAt(i)), i + 1);
                ans.deleteCharAt(str.charAt(i));
                //ans.deleteCharAt(i);

                //No
                printString(str, ans, i + 1);
        }
        public static void main(String[] args) {
                String str = "abc";
                StringBuilder s = new StringBuilder("");
                printString(str, s, 0);
        }        
}
