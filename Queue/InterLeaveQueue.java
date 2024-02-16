import java.util.*;
import java.util.LinkedList;

class InterLeaveQueue {
        static void integrateQueue(Queue<Integer> q) {
                Queue<Integer> q2 = new LinkedList<>();

                int size = q.size();
                for(int i = 0; i < size / 2; i++) {
                        q2.add(q.remove());
                }

                while(!q2.isEmpty()) {
                        q.add(q2.remove());
                        q.add(q.remove());
                }
        }
        public static void main(String[] args) {
                Queue<Integer> q = new LinkedList<>();
                q.add(1);
                q.add(2);
                q.add(3);
                q.add(4);
                q.add(5);
                q.add(6);
                q.add(7);
                q.add(8);
                q.add(9);
                q.add(10);

                integrateQueue(q);

                while(!q.isEmpty()) {
                        System.out.print(q.remove() + " ");
                }
        }
}