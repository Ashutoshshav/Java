class CheckPalindrome {
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
                Node newNode = new Node(data);

                newNode.next = head;
                head = newNode;
        }

        void print() {
                Node temNode = head;

                while(temNode != null) {
                        System.out.print(temNode.data + " ");
                        temNode = temNode.next;
                }
        }

        Node mid(Node head) {
                Node s = head;
                Node f = head;

                while(f != null && f.next != null) {
                        s = s.next;
                        f = f.next.next;
                }

                return s;
        }

        boolean palindrome() {
                if(head == null || head.next == null) {
                        return true;
                }

                Node mid = mid(head);

                Node prev = null;
                Node curr = mid;

                while(curr != null) {
                        Node next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }

                Node right = prev;
                Node left = head;

                while(right != null) {
                        if(left.data != right.data) {
                                return false;
                        }
                        left = left.next;
                        right = right.next;
                }
                return true;
        }

        public static void main(String[] args) {
                CheckPalindrome ll = new CheckPalindrome();

                ll.addFirst(1);
                ll.addFirst(2);
                ll.addFirst(1);

                System.out.println(ll.palindrome());

                ll.print();
        }
}