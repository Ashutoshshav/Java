class LinkedList {
        public static class Node {
                int data;
                Node next;

                public Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }

        public static Node head;
        public static Node tail;
        public static int size; //for calculate size of LinkedList

        void addFirst(int data) { // for add head node and its TimeComplexity constant O(1)
                Node newNode = new Node(data); // Creating newNode
                size++;

                if(head == null) { // if any node not exist
                        head = tail = newNode;
                        return;
                }

                newNode.next = head; // Node.next = newNode

                head = newNode; // head = newNode
        }

        void addLast(int data) { //for add tail node and its TimeComplexity constant O(1)
                Node newNode = new Node(data); // creating newNode
                size++;

                if(head == null) { // if any node not exist
                        head = tail = newNode;
                        return;
                }

                tail.next = newNode; // tail.next = newNode
                tail = newNode; // tail = newNode
        }

        void add(int index, int data) { // for add at given index and its TimeC O(n)
                if(index == 0) {
                        addFirst(data);
                        return;
                }
                Node newNode = new Node(data);
                size++;
                
                Node tempNode = head; //creating tempNode for traverse LinkedList

                int i = 0;
                while(i < index - 1) {
                        tempNode = tempNode.next; // it indecates prev Node of index
                        i++;
                }

                newNode.next = tempNode.next;
                tempNode.next = newNode;
        }

        void print() { // for print LinkedList and its TimeComplexity O(n)
                Node temNode = head;

                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }
                System.out.println();
        }

        void removeFirst() {// for remove head and its TimeC is Constant O(1)
                if(size == 0) { // if LinkedList is empty
                        System.out.println("LinkedList is empty");
                        return;
                }
                else if(size == 1) { // if LinkedList contains only one value
                        head = tail = null;
                        size = 0;
                        return;
                }
                head = head.next;
                size--;
        }

        void removeLast() { // for remove tail node and its TimeC is O(n)
                if(size == 0) { // if LinkedList is empty
                        System.out.println("LinkedList is empty");
                }
                else if(size == 1) { // if LinkedList contains only one value 
                        head = tail = null;
                        size = 0;
                        return;
                }

                Node tempNode = head;
                for(int i = 0;i < size - 2;i++) {
                        tempNode = tempNode.next;
                }
                tempNode.next = null;

                tail = tempNode;
                size--;
        }

        void searchKey(int key) { // for search element and its TimeC is O(n)
                Node tempNode = head;

                int i = 0;
                while(tempNode != null) {
                        if(tempNode.data == key) { // key is found
                                System.out.println("Found at index : " + i);
                                return;
                        }
                        tempNode = tempNode.next;
                        i++;
                }
                System.out.println(key + " is not found");
        }

        public static void main(String[] args) {
                LinkedList ll = new LinkedList();

                ll.addFirst(2);
                ll.addFirst(1);

                ll.addLast(3);
                ll.addLast(4);

                ll.add(2, 9);
                
                ll.print();
                
                System.out.println("Size : " + ll.size);

                ll.removeFirst();

                ll.print();
                
                System.out.println("Size : " + ll.size); 

                ll.removeLast();

                ll.print();

                System.out.println("Size : " + ll.size);

                ll.searchKey(3);
        }
}