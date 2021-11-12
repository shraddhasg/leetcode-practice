package com.shraddha;

import java.util.Objects;

public class SwapNodesInPairs {
    public static void printList(ListNodeDummy head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNodeDummy swapPairs(ListNodeDummy head) {
        if (head.val == 0 || head.next == null) return head;
        ListNodeDummy prev = head;
        ListNodeDummy curr = prev.next;
        ListNodeDummy nex = head;
        head = curr;

        while (curr != null) {
//            nex = curr.next;
//            curr.next = prev;
////            if (prev == null) break;
//            prev.next = nex;
//            if (nex == null) break;
//            prev = nex;
//            curr = prev.next;
            nex = curr.next;
            curr.next = prev;
            prev.next = nex;
            prev = prev.next;
            if (nex == null) return head;
            curr = nex.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNodeDummy head;
        ListNodeDummy n = new ListNodeDummy(4);
        n = new ListNodeDummy(3, n);
        n = new ListNodeDummy(2, n);
        head = new ListNodeDummy(1, n);

        System.out.println("Given List = ");
        printList(head);

        ListNodeDummy ansHead = swapPairs(head);
        System.out.println("After swapping pairs node =");
        printList(ansHead);
    }
}
