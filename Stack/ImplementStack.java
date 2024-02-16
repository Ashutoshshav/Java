import java.util.ArrayList;

class ImplementStack {
        static class Stack {
                static ArrayList<Integer> list = new ArrayList<>(); // Stack creating using ArrayList
                
                static boolean isEmpty() {
                        return list.size() == 0; // return true if array is empty
                }

                static void push(int data) {
                        list.add(data);
                }

                static int pop() {
                        if(isEmpty()) {
                                return -1;
                        }
                        int top = list.get(list.size() - 1);
                        list.remove(list.size() - 1);

                        return top;
                }

                static int peek() { // for print Top of the stack
                        if(isEmpty()) {
                                return -1;
                        }
                        return list.get(list.size() - 1);
                }
        }

        public static void main(String[] args) {
                Stack s = new Stack();

                System.out.println(s.isEmpty());
                s.push(1);
                s.push(2);
                s.push(3);

                while(! s.isEmpty()) {
                        System.out.println(s.peek());
                        s.pop();
                }
        }
}
