class Solution {
    public void merge(int[] arr, int low, int mid, int high){
        if(low<high){
            int i = low;
            int j = mid+1;
            int[] temp = new int[high-low+1];
            int k=0;
            while(i<= mid && j<=high){
                if(arr[i]<=arr[j]){
                    temp[k] = arr[i];
                    i++;
                    
                }
                else{
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            if(i>mid){
                while(j<=high){
                    temp[k] = arr[j];
                    k++;
                    j++;
                }
            }
            else{
                while(i<=mid){
                    temp[k] = arr[i];
                    k++;
                    i++;
                }
            }
            for(int a=low; a<=high; a++){
                arr[a] = temp[a-low]; 
            }
        }
    }
    public void ms(int[] nums, int low, int high){
        if(low==high) return;
        int mid = (low+high)/2;
        ms(nums, low, mid);
        ms(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        ms(nums, 0, n-1);
        return nums;
    }
}