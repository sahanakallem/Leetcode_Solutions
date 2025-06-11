// The problem link: https://leetcode.com/problems/powx-n?envType=problem-list-v2&envId=recursion
//This is Medium level recursion problem. Try to solve it by yourself. 
//However, if there is any difficulty in solving it, you can refer to my solutions posted. 
// Solution: https://leetcode.com/problems/powx-n/solutions/6831275/beats-100-clearly-explained-beginner-fri-1g2s

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
           x = (double)1/x ;
           N = Math.abs(N);
        } 
        return helper(x, N);
    }
    private double helper(double x, long n){
        if(n==0) return 1;
        if(n%2==0){
            double res = helper(x, n/2);
            return res*res;
        }
        return x * helper(x, n-1);
    }
}
