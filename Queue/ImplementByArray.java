class ImplementByArray {
        static class Queue {
                int arr[];
                int size;
                int rear;

                Queue(int size) {
                        arr = new int[size];
                        this.size = size;
                        rear = -1;
                }

                boolean isEmpty() {
                        return rear == -1;
                }

                void add(int data) { // TimeC O(1)
                        if(rear == size - 1) {
                                System.out.println("Queue is full");
                                return;
                        }

                        rear++;
                        arr[rear] = data;
                }

                int remove() { // its TimeC is O(n)
                        if(isEmpty()) {
                                System.out.println("Queue is Empty");
                                return -1;
                        }

                        int front = arr[0];
                        for(int i = 0; i < rear; i++) {
                                arr[i] = arr[i + 1]; 
                        }
                        rear--;
                        return front;
                }

                int peek() { // its TimeC O(1)
                        return arr[0];
                }

                void printQueue() {
                        while(! isEmpty()) {
                                System.out.println(remove());
                        }
                }
        }
        public static void main(String[] args) {
                Queue q = new Queue(5);

                q.add(1);
                q.add(2);
                q.add(3);
                q.add(4);

                q.printQueue();
        }
}