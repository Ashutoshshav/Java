class LinkedL {
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

        void addFirst(int data) {
                // Step 1 : Creating a newNode
                Node newNode = new Node(data);

                if(head == null) {
                        head = tail = newNode;
                        return;
                }
                // Step 2 : newNode.next = head
                newNode.next = head;

                // Step 3 : head = newNode
                head = newNode;
        }

        void printLL() { //for print LinkedList
                Node temNode = head;

                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }
        }

        public static void main(String[] args) {
                LinkedL ll = new LinkedL();

                ll.addFirst(45);
                ll.addFirst(28);

                ll.printLL();
        }
}
