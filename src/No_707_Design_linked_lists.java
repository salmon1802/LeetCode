public class No_707_Design_linked_lists {
    int size;
    ListNode head;
    public No_707_Design_linked_lists() {
        head = new ListNode();
        size = 0;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        ListNode res = findNode(index);
        return Integer.parseInt(res.getVal().toString());
    }

    public void addAtHead(int val) {
        ListNode p = new ListNode(val,head.next);
        head.next = p;
        size++;
    }

    public void addAtTail(int val) {
        ListNode tail = new ListNode(val,null);
        ListNode p = findNode(size - 1);
        p.next = tail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode p = findNode(index - 1);
        ListNode temp = new ListNode(val,p.next);
        p.next = temp;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        ListNode p = findNode(index - 1);
        p.next = p.next.next;
        size--;
    }

    public ListNode findNode(int index) {
        if (index < 0) {
            return head;
        }
        ListNode p = head.next;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return p;
            } else {
                p = p.next;
            }
        }
        return null;
    }

    class ListNode {
        Object val;
        ListNode next;

        ListNode(Object x, ListNode next) {
            this.val = x;
            this.next = next;
        }
        ListNode() {
            this.val = null;
            this.next = null;
        }

        public Object getVal() {
            return val;
        }

    }

    public static void main(String[] args) {
        No_707_Design_linked_lists linkedList = new No_707_Design_linked_lists();
        linkedList.addAtIndex(0,10);
//        linkedList.addAtIndex(0,20);
//        linkedList.addAtIndex(1,30);
//        linkedList.get(0);

    }

    public void foreachList() {
        ListNode p = head.next;
        for (int i = 0; i < size; i++) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}
