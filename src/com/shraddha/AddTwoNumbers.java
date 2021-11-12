package com.shraddha;

import java.math.BigInteger;

class ListNode {
    int val;
    ListNodeDummy next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNodeDummy next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void addTwoNumbers(ListNodeDummy l1, ListNodeDummy l2) {
        String number1 = "";
        String number2 = "";
        String revNumber1 = "";
        String revNumber2 = "";

        while (l1 != null) {
            number1 += l1.val + "";
            l1 = l1.next;
        }
        while (l2 != null) {
            number2 += l2.val + "";
            l2 = l2.next;
        }
        for (int i = number1.length() - 1; i >= 0; i--) revNumber1 += number1.charAt(i);
        for (int i = number2.length() - 1; i >= 0; i--) revNumber2 += number2.charAt(i);

        System.out.println("num1 = " + revNumber1 + "\n" + "num2 = " + revNumber2);

        BigInteger b1 = new BigInteger(revNumber1);
        BigInteger b2 = new BigInteger(revNumber2);


        // long n1 =Long.parseLong(revNumber1)+Long.parseLong(revNumber2);
        // int n2 = Math.toIntExact(n1);
        BigInteger n1 = b1.add(b2);

        String num = n1 + "";
        String revNum = "";
        for (int i = num.length() - 1; i >= 0; i--) revNum += num.charAt(i);

        System.out.println("Num = " + num + "\n" + "rev num=" + revNum);

        int data = (Integer.parseInt(revNum.charAt(0) + ""));
        ListNodeDummy head = new ListNodeDummy(data);
        ListNodeDummy n = head;
        for (int i = 1; i < revNum.length(); i++) {
            data = (Integer.parseInt(revNum.charAt(i) + ""));
            n.next = new ListNodeDummy(data);
            n = n.next;
        }

        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }

//        return head;
    }

    public static void main(String[] args) {
        ListNodeDummy list1 = new ListNodeDummy(9);
//        ListNode l1 = list1;
//        l1.next = new ListNode(4);
//        l1 = l1.next;
//        l1.next = new ListNode(9);

        ListNodeDummy list2 = new ListNodeDummy(9);
        ListNodeDummy l2 = list2;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(9);
        l2 = l2.next;
        l2.next = new ListNodeDummy(1);

        addTwoNumbers(list1, list2);

    }
}
