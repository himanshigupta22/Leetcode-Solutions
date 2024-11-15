class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        if(fast == null){
           ListNode temp = head;
           head = head.next;
           temp.next = null;
           return head;
        }

        ListNode slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode deleteNode = slow.next;
        slow.next = slow.next.next;
        deleteNode.next = null;

        return head;
    }
}
