import java.util.*;
import java.util.LinkedList;

class Prac26 {
        static class Stack {
                Queue<Integer> q1 = new LinkedList<>();
                Queue<Integer> q2 = new LinkedList<>();

                boolean isEmpty() {
                        return q1.isEmpty();
                }

                void push(int data) {
                        while (!q1.isEmpty()) {
                                q2.add(q1.remove());
                        }

                        q1.add(data);

                        while (!q2.isEmpty()) {
                                q1.add(q2.remove());
                        }
                }

                int pop() {
                        if (isEmpty()) {
                                System.out.println("Stack is Empty");
                                return -1;
                        }

                        return q1.remove();
                }

                int peek() {
                        if (isEmpty()) {
                                System.out.println("Stack is Empty");
                                return -1;
                        }
                        return q1.peek();
                }
        }

        public static void main(String[] args) {
                Stack s = new Stack();

                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);
                s.pop();

                while(!s.isEmpty()) {
                        System.out.println(s.pop());
                }
        }
}