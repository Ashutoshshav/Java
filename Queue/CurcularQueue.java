class CurcularQueue {
        static class Queue {
                int arr[];
                int size;
                int rear;
                int front;

                Queue(int size) {
                        arr = new int[size];
                        this.size = size;
                        rear = front = -1;
                }

                boolean isEmpty() {
                        return rear == -1 && front == -1;
                }
                
                boolean isFull() {
                        return (rear + 1) % size == front;
                }

                void emQueue(int data) { //TimeC is O(1)
                        if(isFull()) {
                                System.out.println("Queue is Full");
                                return;
                        }
                        else if (rear == -1 && front == -1) {
                                rear = front = 0;
                                arr[rear] = data;
                                return;
                        }
                        rear = (rear + 1) % size;
                        arr[rear] = data;
                }

                int deQueue() { //TimeC is O(1)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }
                        else if(rear == front) {
                                int data = arr[front];
                                rear = front = -1;
                                return data;
                        }
                        int data = arr[front];
                        front = (front + 1) % size;
                        return data;
                }

                int peek() {
                        return arr[front];
                }
        }

        public static void main(String[] args) {
                Queue q = new Queue(5);

                System.out.println(q.isEmpty());
                System.out.println(q.isFull());

                q.emQueue(5);
                q.emQueue(4);
                q.emQueue(3);
                q.emQueue(2);
                q.emQueue(1);

                System.out.println(q.isEmpty());
                System.out.println(q.isFull());

                while(! q.isEmpty()) {
                        System.out.println(q.peek());
                        q.deQueue();
                }
        }
}