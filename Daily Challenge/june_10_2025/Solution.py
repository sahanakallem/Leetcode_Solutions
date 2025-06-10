# The problem link: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i?envType=daily-question&envId=2025-06-10
#This is an Easy level problem. Try to solve it by yourself. 
#However, if there is any difficulty in solving it, you can refer to my solutions posted. 
#Solution: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/solutions/6830623/clearly-explained-beginner-friendly-solution
class Solution:
    def maxDifference(self, s: str) -> int:
        #Counter is essentially a subclass of dict designed specifically for counting frequencies. 
        #It creates a dictionary where keys are the elements and values are their counts.
        count = Counter(s).values()
        return max(odd for odd in count if odd%2)-min(even for even in count if not even%2)
