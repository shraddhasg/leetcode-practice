package com.shraddha;

public class MergeTwoSortedLists {
    public static void printList(ListNodeDummy head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void addToList(ListNodeDummy head, ListNodeDummy list) {
        while (list != null) {
            head.next = list;
            list = list.next;
        }
    }

    public static ListNodeDummy mergeTwoLists(ListNodeDummy l1, ListNodeDummy l2) {
        ListNodeDummy head;
        ListNodeDummy finalHead;
//        if (l1.val == null) {
//            head = l2;
//            addToList(head,l2);
//        }
        if (l1 != null) head = l1;
        else head = l2;

        finalHead = head;

        while (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                if (head != finalHead) {
                    head.next = l1;
                    head = l1;
                }
                l1 = l1.next;
                head.next = l2;
                head = l2;
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                head.next = l1;
                head = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) addToList(head, l1);
        if (l2 != null) addToList(head, l2);
        return finalHead;
    }

    public static void main(String[] args) {
        ListNodeDummy head1;
        ListNodeDummy n = new ListNodeDummy(4);
        n = new ListNodeDummy(2, n);
        head1 = new ListNodeDummy(1, n);
//        head1 = new ListNodeDummy();
        System.out.println("List one = ");
        printList(head1);

        ListNodeDummy head2;
        ListNodeDummy p = new ListNodeDummy(4);
        p = new ListNodeDummy(3, p);
        head2 = new ListNodeDummy(1, p);
//        head2 = new ListNodeDummy(1);
        System.out.println("List two = ");
        printList(head2);

        ListNodeDummy ans = mergeTwoLists(head1, head2);
        System.out.println("Mearge List = ");
        printList(ans);
    }
}
