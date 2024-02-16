class lili {
        class Node {
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
                Node newNode = new Node(data);

                if(head == null) {
                        head = tail = newNode;
                        return;
                }

                newNode.next = head;
                
                head = newNode;
        }

        void addLast(int data) {
                Node newNode = new Node(data);

                if(head == null) {
                        head = tail = newNode;
                        return;
                }

                tail.next = newNode;

                tail = newNode;
        }

        void print() {
                Node tempNode = head;

                while(tempNode != null) {
                        System.out.print(tempNode.data + " ");
                        tempNode = tempNode.next;
                }
        }

        public static void main(String[] args) {
                lili ll = new lili();

                ll.addFirst(63);
                ll.addFirst(41);
                ll.addFirst(68);
                ll.addLast(25);
                ll.addLast(45);

                ll.print();
        }        
}
