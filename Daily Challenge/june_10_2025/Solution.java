// The problem link: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i?envType=daily-question&envId=2025-06-10
//This is an Easy level problem. Try to solve it by yourself. 
//However, if there is any difficulty in solving it, you can refer to my solutions posted. 
// Java Solution: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/solutions/6830623/clearly-explained-beginner-friendly-solution

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max_odd = Integer.MIN_VALUE;
        int min_even = Integer.MAX_VALUE;
        int n = s.length();
        for(int i=0; i<n; i++){
            int t = hm.getOrDefault(s.charAt(i), 0);
            hm.put(s.charAt(i), t+1); 
        }
        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Character, Integer> entry = itr.next();
            int t = entry.getValue();
            if((t)%2==0 && min_even>t) min_even = t;
            else if((t)%2!=0 && max_odd<t) max_odd = t;
        }
        return max_odd - min_even;
    }
}
