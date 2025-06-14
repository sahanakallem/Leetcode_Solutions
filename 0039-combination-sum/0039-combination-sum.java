class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ds = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        int n = candidates.length;
        helper(candidates, target, ds, ls, 0, n);
        return ds;
    }
    public void helper(int[] arr, int target, List<List<Integer>> ds, List<Integer> ls, int ind, int n){
        if(ind==n || target<0) return;
        if(target==0){
            ds.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[ind]);
        helper(arr, target-arr[ind], ds, ls, ind, n);
        ls.remove(ls.size() - 1);
        helper(arr, target, ds, ls, ind+1, n);
    }
}