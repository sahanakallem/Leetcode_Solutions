# The problem link: https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=recursion 
#This is an Easy recursion problem. Try to solve it by yourself. 
#However, if there is any difficulty in solving it, you can refer to my solutions posted. 
# Refer this for clear explanation: https://leetcode.com/problems/power-of-two/solutions/6821363/easy-recursive-solution-beats-100/
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n==1:
            return True
        if n%2!=0 or n ==0:
            return False
        return self.isPowerOfTwo(n/2)
