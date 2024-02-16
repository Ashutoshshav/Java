// for convert number into string
class ConvertIntoString {
        static String st[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};

        static StringBuilder printNumber(int num, StringBuilder str) {
                if(num == 0) {
                        return null;
                }

                printNumber(num / 10, str);
                int lastNum = num % 10;
                str = str.append(st[lastNum]);

                return str;
        }
        public static void main(String[] args) {
                int num = 1234;
                StringBuilder string = new StringBuilder("");
                System.out.println(printNumber(num, string));
        }
}
