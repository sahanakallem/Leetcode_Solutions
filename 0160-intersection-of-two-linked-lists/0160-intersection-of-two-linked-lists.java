/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        // if there is no intersection, both the pointer become equal at null and the while loop stops.
        while(pointerA!=pointerB){
            pointerA = (pointerA==null)? headB : pointerA.next;
            pointerB = (pointerB==null)? headA : pointerB.next;
        }
        //Both the pointers are traversing equal length A+B
        //So, when both of them switch the linkedlist, they end up cancelling the length difference and that makes them both be at equal distance from the intersection.
        return pointerA;
    }
}