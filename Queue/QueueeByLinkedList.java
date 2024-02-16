class QueueByLinkedList {
        static class Node {
                int data;
                Node next;

                Node(int data) {
                        this.data = data;
                        next = null;
                }
        }

        static Node rear;
        static Node front;
        static int size = 0;

        static class Queue {
                boolean isEmpty() {
                        return size == 0;
                }

                void enQueue(int data) { //O(1)
                        Node newNode = new Node(data);
                        size++;
                        if(rear == null && front == null) {
                                rear = front = newNode;
                                return;
                        }
                        rear.next = newNode;
                        rear = newNode;
                }

                int deQueue() { // O(n)
                        if(front == null && rear == null) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }
                        int data = front.data;
                        front = front.next;
                        size--;

                        return data;
                }

                int peek() {
                        return front.data;
                }
        }

        public static void main(String[] args) {
                Queue q = new Queue();

                q.enQueue(1);
                q.enQueue(2);
                q.enQueue(3);
                q.enQueue(4);
                q.enQueue(5);
                q.enQueue(6);

                while(! q.isEmpty()) {
                        System.out.println(q.peek());
                        q.deQueue();
                }
        }
}