class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int rsum = 0, lsum=0;
        for(int i=0; i<len;i++){
            rsum+=nums[i];
        }
        int[] ans = new int[len];
        for(int i = 0; i<len; i++){
            rsum-=nums[i]; 
            ans[i] = Math.abs(rsum-lsum);
            lsum += nums[i];
        }
        return ans;
    }
}