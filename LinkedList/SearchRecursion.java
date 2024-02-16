class SearchRecursion {
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

        void searchKey(int key, Node tempNode, int i) {
                if(tempNode.data == key) {
                        System.out.println(key + " is found at index " + i);
                        return;
                }
                if(tempNode.next == null) {
                        System.out.println(key + " not found");
                        return;
                }
                i++;
                searchKey(key, tempNode.next, i);
        }

        public static void main(String[] args) {
                SearchRecursion ll = new SearchRecursion();

                ll.head = new Node(85);
                ll.head.next = new Node(62);
                ll.head.next.next = new Node(68);
                ll.head.next.next.next = new Node(41);

                Node temNode = head;
                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }

                System.out.println();
                
                Node tempNode = head;
                ll.searchKey(41, tempNode, 0);
        }
}
