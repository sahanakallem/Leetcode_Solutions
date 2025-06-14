class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> s = new HashSet<>();
        int n = digits.length;
        for(int i=0; i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n; j++){
                if(j==i) continue;
                for(int k=0; k<n; k++){
                    if(k==i||k==j){
                        continue;
                    }
                    if(digits[k]%2==0){
                    int num = 100 * digits[i]+ 10*digits[j] + 1*digits[k];
                    s.add(num);

                }
            }
        }
    }
    return s.size();
}
}