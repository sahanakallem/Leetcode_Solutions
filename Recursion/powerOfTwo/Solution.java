// The problem link: https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=recursion 
//This is an Easy recursion problem. Try to solve it by yourself. 
//However, if there is any difficulty in solving it, you can refer to my solutions posted. 
// Java Solution: https://leetcode.com/problems/power-of-two/solutions/6823919/clearly-explained-beats-100-by-kallemsah-sxk8/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n==0||n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
