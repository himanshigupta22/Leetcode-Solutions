class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        while(head.val == val){
            head = head.next;
            temp = head;
            if(head == null) return head;
        }
        if(head.next == null){
            return head;
        }
        while(temp != null){
            if(temp.val == val){
               prev.next = prev.next.next;
               temp = temp.next;
               continue;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
