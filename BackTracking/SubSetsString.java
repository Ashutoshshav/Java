public class SubSetsString {
        static void subSetsString(String str, String newStr, int i) { //its TimeC O(n * 2^n) and SpaceC O(n)
                if(i == str.length()) {
                        if(newStr.length() == 0) {
                                System.out.println("null");
                        }
                        else {
                                System.out.println(newStr);
                        }
                        return;
                }
                
                subSetsString(str, newStr + str.charAt(i), i + 1);
                subSetsString(str, newStr, i + 1);

        }
        public static void main(String[] args) {
                String str = "abc";

                subSetsString(str, "", 0);
        }
}
