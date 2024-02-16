class Linked {
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

        void addLast(int data) {
                // Step 1 : Creating newNode
                Node newNode = new Node(data);

                if(head == null) {
                        head = tail = newNode;
                        return;
                }

                // Step 2 : tail.next = newNode 
                tail.next = newNode;

                // Step 3 : tail = newNode
                tail = newNode;
        }

        public static void main(String[] args) {
                Linked ll = new Linked();

                ll.addLast(45);
                ll.addLast(85);
        }        
}
