import java.util.*;
class ReverseStack {
        //for push element At Buttom of the Stack 
        static void pushAtButtom(int data, Stack<Integer> s) {
                if(s.isEmpty()) {
                        s.push(data);
                        return;
                }
                int top = s.pop();
                pushAtButtom(data, s);
                s.push(top);
        }

        //for reverse Stack
        static void reverseStack(Stack<Integer> s) {
                if(s.isEmpty()) {
                       return; 
                }
                int top = s.pop();
                reverseStack(s);
                pushAtButtom(top, s);
        }

        //for print Stack
        static void printStack(Stack<Integer> s) {
                if(s.isEmpty()) {
                        return;
                }

                int val = s.pop();
                System.out.println(val);
                printStack(s);
                s.push(val);
        }
        public static void main(String[] args) {
                Stack<Integer> s = new Stack<>();

                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);
                s.push(5);

                printStack(s);

                reverseStack(s);
                System.out.println();

                printStack(s);
        }
}