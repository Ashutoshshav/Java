import java.util.*;

class ShortedPath {
        public static void main(String[] args) {
                String str = "NSNSNSNSN";

                int x = 0;
                int y = 0;

                for(int i = 0;i < str.length();i++){
                        char dir = str.charAt(i);

                        //North
                        if(dir == 'N'){
                                y++;
                        }
                        //South
                        else if(dir == 'S'){
                                y--;
                        }
                        //West
                        else if(dir == 'W'){
                                x--;
                        }
                        //East
                        else if(dir == 'E'){
                                x++;
                        }
                }

                int x2 = x * x;
                int y2 = y * y;

                float n = (float)Math.sqrt(x2 + y2);

                System.out.println(n);
        }
}