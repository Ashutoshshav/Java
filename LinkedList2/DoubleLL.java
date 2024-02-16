class DoubleLL {
        static class Node {
                int data;
                Node prev;
                Node next;

                Node(int data) {
                        this.data = data;
                        this.prev = null;
                        this.next = null;
                }
        }

        static Node head;
        static Node tail;
        static int size;

        void addFirst(int data) {
                Node newNode = new Node(data);
                size++;

                if(head == null && tail == null) {
                        head = tail = newNode;
                        return;
                }

                head.prev = newNode;
                newNode.next = head;
                head = newNode;
        }

        void addLast(int data) {
                Node newNode = new Node(data);
                size++;

                if(head == null && tail == null) {
                        head = tail = newNode;
                        return;
                }

                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
        }

        int removeFirst() {
                if(head == null) {
                        return Integer.MIN_VALUE;
                }
                if(size == 1) {
                        int data = head.data;
                        head = tail = null;
                        size--;
                        return data;
                } 
                int data = head.data;

                head = head.next;
                size--;
                head.prev = null;

                return data;
        }

        int removeLast() {
                if(head == null) {
                        return Integer.MIN_VALUE;
                }
                if(size == 1) {
                        int data = head.data;
                        head = tail = null;
                        size--;

                        return data;
                }

                int data = tail.data;
                tail = tail.prev;
                size--;
                tail.next = null;

                return data;
        }

        int peek() {
                return head.data;
        }

        void printDLL() {
                Node temp = head;

                while(temp != null) {
                        System.out.println(temp.data + " ");
                        temp = temp.next;
                }
        }
        public static void main(String[] args) {
                DoubleLL dll = new DoubleLL();

                dll.addFirst(5);
                dll.addFirst(4);
                dll.addFirst(3);
                dll.addFirst(2);
                dll.addFirst(1);

                dll.printDLL();
        }
}