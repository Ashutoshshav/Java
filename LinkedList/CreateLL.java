class CreatingLL {
        static class Node {
                int data;
                Node next;

                Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }

        public static Node head;
        public static Node tail;

        public static void main(String[] args) {
                CreatingLL ll = new CreatingLL();

                head = new Node(1);
                head.next = new Node(2);

                Node temp = head;

                while(temp != null) {
                        System.out.print(temp.data + " ");
                        temp = temp.next;
                }
        }
} 