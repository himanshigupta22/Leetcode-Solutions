class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }
        head = prev;
        return head;
    }
}
