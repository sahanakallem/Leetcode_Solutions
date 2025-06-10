// The problem link: https://leetcode.com/problems/swap-nodes-in-pairs 
//This is an Easy recursion problem. Try to solve it by yourself. 
//However, if there is any difficulty in solving it, you can refer to my solutions posted. 
//Solution: https://leetcode.com/problems/swap-nodes-in-pairs/solutions/6830811/beats-100-clearly-explained-by-kallemsah-wytf

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next == null) return head;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        head = temp;
        //head = head.next;
        head.next.next = swapPairs(head.next.next);
        return head;
    }
}
