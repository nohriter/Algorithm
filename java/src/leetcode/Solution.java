package leetcode;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(2, null);
        ListNode listNode2 = new ListNode(1, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        deleteDuplicates(listNode1);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == prev.val) {
                prev.next = cur.next;
                cur = prev;
            }
            prev = cur;
            cur = cur.next;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
