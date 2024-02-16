class ImplementByLinkedList {
        static class Node {
                int data;
                Node next;

                Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }

        static class Stack {
                static Node head = null;

                static boolean isEmpty() {
                        return head == null;
                }

                static void push(int data) {
                        Node newNode = new Node(data);

                        if(isEmpty()) {
                                head = newNode;
                                return;
                        }

                        newNode.next = head;
                        head = newNode;
                }

                static int pop() {
                        if(isEmpty()) {
                                return -1;
                        }
                        int top = head.data;

                        head = head.next;

                        return top;
                }

                static int peek() {
                        if(isEmpty()) {
                                return -1;
                        }

                        return head.data;
                }
        }
        public static void main(String[] args) {
                Stack s = new Stack();

                s.push(45);
                s.push(47);
                s.push(25);

                while(! s.isEmpty()) {
                        System.out.println(s.peek());
                        s.pop();
                }
        }
}