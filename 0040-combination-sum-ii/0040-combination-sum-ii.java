class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);  // Needed to handle duplicates
        findComb(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findComb(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int j = index; j < arr.length; j++) {
            if (j > index && arr[j] == arr[j - 1]) continue; // Skip duplicates

            if (arr[j] > target) break; // No need to proceed further

            ds.add(arr[j]);
            findComb(j + 1, arr, target - arr[j], ans, ds); // j+1 to avoid reusing same element
            ds.remove(ds.size() - 1); // Backtrack
        }
    }
}
