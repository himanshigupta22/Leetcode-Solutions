class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        ListNode curr = head;
        ListNode prev = null;

        int size = 1;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }
        k = k % size;
        if(k == 0) return head;

        tail.next = head;
        int step = size - k;
        while(step != 0){
            prev = curr;
            curr = curr.next;
            step--;
        }
        ListNode newHead = curr;
        prev.next = null;

        return newHead;
    }
}
