public class RemoveDuplicateChar {
        static void removeDuplicateChar(String str, StringBuilder newStr, int index, boolean array[]) {
                if(index == str.length()) {
                        System.out.println(newStr);
                        return;
                }

                int currInd = str.charAt(index) - 'a';

                if(array[currInd] == true) {
                        removeDuplicateChar(str, newStr, index + 1, array);
                }

                else {
                        array[currInd] = true;
                        removeDuplicateChar(str, newStr.append(str.charAt(index)), index + 1, array);
                }
        }
        public static void main(String[] args) {
                StringBuilder sb = new StringBuilder("");

                String str = "apnacollege";

                boolean array[] = new boolean[26];
                
                removeDuplicateChar(str, sb, 0, array);
        }
}
