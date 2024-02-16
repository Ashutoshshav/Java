class ReverseLinkedList {
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

        void reverse() {
                Node prev = null;
                Node curr = tail = head;
                Node nextN;

                while(curr != null) {
                        nextN = curr.next; 
                        curr.next = prev; // reverse point
                        prev = curr; // forward prev
                        curr = nextN; // forword curr
                }
                head = prev; // last stage curr == null so head = prev
        }

        public static void main(String[] args) {
                ReverseLinkedList ll = new ReverseLinkedList();

                ll.head = new Node(12);
                ll.head.next = new Node(23);
                ll.head.next.next = new Node(31);
                ll.head.next.next.next = new Node(45);
                ll.head.next.next.next.next = new Node(52);

                Node temNode = head;

                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }

                System.out.println();

                ll.reverse();

                Node tNode = head;
                
                while(tNode != null) {
                        System.out.print(tNode.data + " ");
                        tNode = tNode.next;
                }
        }
}
