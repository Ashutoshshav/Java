import java.util.Stack;

class QueueUsingStack {
        static class Queue {
                Stack<Integer> s1 = new Stack<>();
                Stack<Integer> s2 = new Stack<>();

                boolean isEmpty() { // TimeC O(1)
                        return s1.isEmpty();
                }

                void add(int data) { // Here its TimeC is O(n)
                        while(! s1.isEmpty()) {
                                s2.push(s1.pop());
                        }
                        
                        s1.push(data);

                        while(! s2.isEmpty()) {
                                s1.push(s2.pop());
                        }
                }

                int remove() { // TimeC is O(1)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }
                        return s1.pop();
                }

                int peek() { // TimeC is O(1)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }

                        return s1.peek();
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
                        System.out.println(q.peek());
                        q.remove();
                }
        }
}