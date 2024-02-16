public class StrUpperCase {
        public static void main(String[] args) {
                StringBuilder sb = new StringBuilder("");

                String str = "hi, i am ashutosh shav";

                sb.append(Character.toUpperCase(str.charAt(0)));
                for(int i = 1;i < str.length();i++){
                        if(str.charAt(i) == ' ' && i < str.length() - 1){
                                sb.append(str.charAt(i));
                                i++;
                                sb.append(Character.toUpperCase(str.charAt(i)));
                        }
                        else{
                                sb.append(str.charAt(i));
                        }
                }

                sb.toString();//toString is used for convert into String
                System.out.println(sb);
        }
}
