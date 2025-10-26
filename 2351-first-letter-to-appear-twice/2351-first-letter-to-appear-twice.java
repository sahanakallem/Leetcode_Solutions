class Solution {
    public char repeatedCharacter(String s) {
        int appear = 0, current = 0;
        for(int i=0; i<s.length(); i++){
            current = 1<<(s.charAt(i)-'a');
            if((current & appear) != 0){
                return s.charAt(i);
            }
            appear |=current;
        }
        return s.charAt(s.length()-1);
    }
}