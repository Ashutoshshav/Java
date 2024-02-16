import java.util.*;
class AddInLast {
        static void addAtButtom(int data, Stack<Integer> s) {
                if(s.isEmpty()) {
                        s.push(data);
                        return;
                }
                int top = s.pop();
                addAtButtom(data, s);
                s.push(top);
        }
        public static void main(String[] args) {
                Stack<Integer> s = new Stack<>();

                s.push(85);
                s.push(45);
                s.push(29);

                addAtButtom(10, s);

                while(! s.isEmpty()) {
                        System.out.println(s.pop());
                }
        }
}