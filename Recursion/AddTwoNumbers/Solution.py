# The problem link: https://leetcode.com/problems/add-two-numbers
# This is Medium level recursion problem. Try to solve it by yourself. 
# However, if there is any difficulty in solving it, you can refer to my solutions posted. 
# Java Solution: https://leetcode.com/problems/add-two-numbers/solutions/6827734/beats-100-clearly-explained-by-kallemsah-i2w1
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        return self.helper(l1, l2, 0)
    def helper(self, l1: Optional[ListNode], l2: Optional[ListNode], carry: int) -> Optional[ListNode]:
        if l1 is None and l2 is None and carry==0: return None
        sum = carry
        if l1 is not None: sum+=l1.val
        if l2 is not None: sum+=l2.val
        node = ListNode(sum%10)
        node.next = self.helper(l1.next if l1 else None, l2.next if l2 else None, sum//10)
        return node
