class ReverseDLL {
        static class Node {
                int data;
                Node next;
                Node prev;

                Node(int data) {
                        this.data = data;
                        this.next = null;
                        this.prev = null;
                }
        }

        static Node head;
        static Node tail;
        static int size;

        static void addFirst(int data) {
                Node newNode = new Node(data);
                size++;

                if(head == null) {
                        head = tail = newNode;
                        return;
                }

                head.prev = newNode;
                newNode.next = head;
                head = newNode;
        }

        static int removeFirst() {
                int data = head.data;

                head = head.next;
                head.prev = null;

                return data;
        }

        static void printDLL() {
                Node temp = head;

                while(temp != null) {
                        System.out.print(temp.data + " ");
                        temp = temp.next;
                }
        }

        static void reverseDLL() {
                Node prev = null;
                Node curr = head;
                Node next;

                while(curr != null) {
                        next = curr.next;
                        prev = curr.prev;
                        curr.next = prev;
                        curr.prev = next;

                        prev = curr;
                        curr = next;
                }
                head = prev;
        }
        public static void main(String[] args) {
                ReverseDLL dll = new ReverseDLL();

                dll.addFirst(3);
                dll.addFirst(2);
                dll.addFirst(1);

                dll.printDLL();

                dll.reverseDLL();

                System.out.println();
                dll.printDLL();
        }
}
