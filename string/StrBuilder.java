public class StrBuilder {
        public static void main(String[] args) {
                StringBuilder sb = new StringBuilder("");

                for(char i = 'A';i <= 'Z';i++){
                        sb.append(i);//append() is used for StringBuilder
                }

                System.out.println(sb);
        }
}