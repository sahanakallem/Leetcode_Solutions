class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int n = 0;
        for(int i=1; i<len; i++){
            if(nums[i]<nums[i-1]){
                n= i;
                break;
            } 
        }
        for(int i = n; i<len+n-1; i++){
            if(nums[i%len]>nums[(i+1)%len]) return false;

        }
        return true;
    }
}