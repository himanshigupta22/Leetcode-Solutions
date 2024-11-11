class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while(l1 != null || l2 != null || carry != 0){
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;
            int sum = d1 + d2 + carry;
            int rem = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(rem);
            tail.next = newNode;
            tail = tail.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
           
        }
        ListNode head = dummyHead.next;
        return head;
    }
}
