class RemoveNthNode {
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
        public static int size = 0;

        void removeNth(int index) {
                Node temNode = head;
                while(temNode != null) {
                        temNode = temNode.next;
                        size++;
                }
                if((size - index) == 0) {
                        head = head.next;
                        return;
                }

                Node tempNode = head;
                
                int i = 1;
                while(i < (size - index)) {
                        tempNode = tempNode.next;
                        i++;
                }

                tempNode.next = tempNode.next.next;
        } 

        public static void main(String[] args) {
                RemoveNthNode ll = new RemoveNthNode();

                ll.head = new Node(45);
                ll.head.next = new Node(26);
                ll.head.next.next = new Node(12);
                ll.head.next.next.next = new Node(30);
                ll.head.next.next.next.next = new Node(25);
                ll.head.next.next.next.next.next = new Node(36);
                
                Node temNode = head;

                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }

                System.out.println();

                ll.removeNth(1);

                Node tempNode = head;

                while(tempNode != null) {
                        System.out.print(tempNode.data + " ");
                        tempNode = tempNode.next;
                }
        }
}
