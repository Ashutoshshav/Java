import java.util.Stack;

class Queuestack {
        static class Queue {
                Stack<Integer> s1 = new Stack<>();
                Stack<Integer> s2 = new Stack<>();

                boolean isEmpty() { // TimeC O(1)
                        return s1.isEmpty();
                }

                void add(int data) { // TimeC O(1)
                        s1.push(data);
                }

                int remove() { // TimeC O(n)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }

                        while(! s1.isEmpty()) {
                                s2.push(s1.pop());
                        }

                        int data = s2.pop();

                        while(! s2.isEmpty()) {
                                s1.push(s2.pop());
                        }

                        return data;
                }

                int peek() { // TimeC O(n)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }
                        while(!s1.isEmpty()) {
                                s2.push(s1.pop());
                        }

                        int data = s2.peek();

                        while(!s2.isEmpty()) {
                                s1.push(s2.pop());
                        }

                        return data;
                }
        }

        public static void main(String[] args) {
                Queue q = new Queue();

                q.add(1);
                q.add(2);
                q.add(3);
                q.add(4);
                q.add(5);

                while(!q.isEmpty()) {
                        System.out.println(q.remove());
                }
        }
}