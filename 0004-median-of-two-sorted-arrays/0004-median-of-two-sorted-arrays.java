class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] nums = new int[(total/2)+1];
        int n1=0, n2=0;
        double median = 0;
        if(total%2==0){
        for(int i=0; i<=total/2; i++){
            if(n1==nums1.length){
                nums[i]=nums2[n2];
                n2++;
            }
            else if(n2==nums2.length){
                nums[i]=nums1[n1];
                n1++;
            }
            else if(n1<nums1.length && nums1[n1]<=nums2[n2]){
                nums[i]=nums1[n1];
                n1++;
            }
            else{
                nums[i]=nums2[n2];
                n2++;
            }
        }
        median = ((double)(nums[(total/2)-1]+nums[total/2]))/2;
        }
        if(total%2!=0){
        for(int i=0; i<=(total/2); i++){
            if(n1==nums1.length){
                nums[i]=nums2[n2];
                n2++;
            }
            else if(n2==nums2.length){
                nums[i]=nums1[n1];
                n1++;
            }
            else if(n1<nums1.length && nums1[n1]<=nums2[n2]){
                nums[i]=nums1[n1];
                n1++;
            }
            else{
                nums[i]=nums2[n2];
                n2++;
            }
        }
        median = (double)(nums[(total/2)]);
        }
        return median;
    }
}