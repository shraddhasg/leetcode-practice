package com.shraddha;

class ListNodeDummy {
    int val;
    ListNodeDummy next;

    ListNodeDummy() {
    }

    ListNodeDummy(int val) {
        this.val = val;
    }

    ListNodeDummy(int val, ListNodeDummy next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthNodeFromEndOfList {
    public static void printList(ListNodeDummy head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static int lengthOfList(ListNodeDummy head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static ListNodeDummy removeNthFromEnd(ListNodeDummy head, int n) {
        ListNodeDummy t = head;
        int lengthOfList = lengthOfList(head);
        System.out.println("length of list = " + lengthOfList);

        int count = 1;
        if (lengthOfList == 1) return null;
        if (lengthOfList == n) return head.next;
        while (count != (lengthOfList - n)) {
            t = t.next;
            count++;
        }
        t.next = t.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNodeDummy head;
        ListNodeDummy n = new ListNodeDummy(5);
        n = new ListNodeDummy(4, n);
        n = new ListNodeDummy(3, n);
        n = new ListNodeDummy(2, n);
        head = new ListNodeDummy(1, n);

//        ListNodeDummy n = new ListNodeDummy(2);
//        head = new ListNodeDummy(1, n);

        System.out.println("Original list = ");
        printList(head);
        ListNodeDummy ans = removeNthFromEnd(head, 4);
        System.out.println("After deleting last nth node =");
        printList(ans);
    }
}
