class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = target;
        int n = letters.length;
        int num_res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int diff = letters[i] - target;
            if(diff>0){
                num_res = Math.min(num_res, diff);
            }
        }
        if(num_res==Integer.MAX_VALUE){
            res = letters[0];
        }
        else{
            res+=num_res;
        }
        return res;
    }
}