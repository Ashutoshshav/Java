import java.util.*; // for create stack import java.util.*;

class StringReverse { // now not success
        static String reverseString(String str) {
                Stack<Character> s = new Stack<>();
                int i = 0;
                while(i < str.length()) { 
                        s.push(str.charAt(i));
                        i++;
                }

                StringBuilder S = new StringBuilder("");

                while(! s.isEmpty()) {
                        S.append(s.pop());
                }

                return str = S.toString();
        }
        public static void main(String[] args) {
                String str = "ashutosh shav";

                System.out.println(reverseString(str));
        }
}