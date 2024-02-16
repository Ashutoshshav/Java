import java.util.*;

class String8{
        public static void main(String args[]){
                StringBuilder name = new StringBuilder("Ashutosh Shav");

                for(int i = 0;i < name.length() / 2;i++){
                        int front = i;
                        int back = name.length() - i - 1;

                        char frontChar = name.charAt(front);
                        char backChar = name.charAt(back);

                        name.setCharAt(front, backChar);
                        name.setCharAt(back, frontChar);
                }

                System.out.print(name);
        }
}