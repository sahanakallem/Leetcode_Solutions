class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        boolean answer = false;
        for(int i = 0; i<s.length(); i++){
            a : for(int j=i; j<s.length()+i; j++){
                if(s.charAt(j%s.length())!=goal.charAt(j-i)){
                    answer = false;
                  break a;  
                } 
                answer = true;
            }
            if(answer) return true;
        }
        return false;
    }
}