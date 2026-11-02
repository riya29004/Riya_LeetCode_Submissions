class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int count=0;
       int max =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                 count++;
             max = Math.max(max , count);
            }
            else {
            max = Math.max(max , count);
                count=0;
        }
        }
        return max+1;
    }
}