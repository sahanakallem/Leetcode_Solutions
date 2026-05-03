class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int even = 0, odd=0;
        for(int i=0; i<n; i++){
            if((nums[i]&1)==1) odd++;
            else even++;
        }
        for(int i=0; i<n; i++){
            if((nums[i]&1)!=1){
               answer[i] = odd; 
                even=even-1;
            } 
            else{
               answer[i] = even;
                odd = odd-1;
            } 
        }
        return answer;
    }
}