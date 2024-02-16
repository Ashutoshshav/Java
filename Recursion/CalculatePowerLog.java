public class CalculatePowerLog {
        //This code is calculate power in better time complexity(log power)
        static int calculatePowerLog(int num, int power) {
                if(power == 1) {
                        return num;
                }
                else if(power % 2 == 0) {
                        return calculatePowerLog(num, power/2) * calculatePowerLog(num, power/2);
                }
                else{
                        return num * calculatePowerLog(num, power/2) * calculatePowerLog(num, power/2);
                }
        }
        public static void main(String[] args) {
                int num = 5;
                int power = 5;

                System.out.println(calculatePowerLog(num, power));
        }
}
