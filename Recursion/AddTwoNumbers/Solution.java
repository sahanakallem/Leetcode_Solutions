// The problem link: https://leetcode.com/problems/add-two-numbers
//This is Medium level recursion problem. Try to solve it by yourself. 
//However, if there is any difficulty in solving it, you can refer to my solutions posted. 
// Java Solution: https://leetcode.com/problems/add-two-numbers/solutions/6827734/beats-100-clearly-explained-by-kallemsah-i2w1

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       return helper(l1, l2, 0);
    }
    private ListNode helper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null&&carry==0) return null;
        int sum = carry;
        if(l1!=null) sum+=l1.val;
        if(l2!=null) sum+=l2.val;
        ListNode node = new ListNode(sum%10);
        node.next = helper(l1!=null? l1.next: null, l2!=null? l2.next:null, sum/10);
        return node;
    }
}
