# The problem link: https://leetcode.com/problems/powx-n?envType=problem-list-v2&envId=recursion
# This is Medium level recursion problem. Try to solve it by yourself. 
# However, if there is any difficulty in solving it, you can refer to my solutions posted. 
# Solution: https://leetcode.com/problems/powx-n/solutions/6831275/beats-100-clearly-explained-beginner-fri-1g2s
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n==0: return float(1)
        if n<0:
            x = 1/x
            n = abs(n)
        if n%2==0:
            res = self.myPow(x, n//2)
            return res * res
        return x * self.myPow(x, n-1)
