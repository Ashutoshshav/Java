class DetectCricularLinkedList {
        static class Node {
                int data;
                Node next;

                Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }
        static Node head;

        static boolean isCircular() {
                Node slow = head;
                Node fast = head;

                while(fast != null && fast.next != null) {
                        slow = slow.next;
                        fast = fast.next.next;

                        if(fast == slow) {
                                return true;
                        }
                }

                return false;
        }

        public static void main(String[] args) {
                head = new Node(1);
                head.next = new Node(2);
                head.next.next = new Node(3);
                //head.next.next.next = head;
                head.next.next.next = new Node(4);

                System.out.println(isCircular());
        }
}
