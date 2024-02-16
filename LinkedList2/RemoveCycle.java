class RemoveCycle {
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

                        if(slow == fast) {
                                return true;
                        }
                }

                return false;
        }

        static void removeCycle() {
                Node slow = head;
                Node fast = head;

                while(fast != null && fast.next != null) { // detect cycle
                        slow = slow.next;
                        fast = fast.next.next;
                        
                        if(slow == fast) {
                                break;
                        }
                }
                // find meeting point
                slow = head;
                Node prev = null;

                while(slow != fast) {
                        slow = slow.next;
                        prev = fast; // last Node
                        fast = fast.next;
                }

                prev.next = null; // removeCycle -> last.next = null
        }
        public static void main(String[] args) {
                head = new Node(1);
                Node temp = new Node(2);
                head.next = temp;
                head.next.next = new Node(3);
                //head.next.next.next = new Node(4);
                head.next.next.next = temp;

                System.out.println(isCircular());

                removeCycle();

                System.out.println(isCircular());
        }
}