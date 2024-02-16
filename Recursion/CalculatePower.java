/* public class CalculatePower {
        static int calculatePower(int num, int power) {
                if(power == 1) {
                        return num;
                }
                int value = calculatePower(num, power - 1) * num;

                return value;
        }
        public static void main(String[] args) {
                int num = 5;
                int power = 97;

                System.out.println(calculatePower(num, power));
        }
} */