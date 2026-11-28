class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        if(nums.length == 1){
           if(k>=0) return 0;
        }
        int[] suffix = new int[nums.length];
        int cnt =-1;
        suffix[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = Math.min(nums[i] , suffix[i+1]);
        }
        int max = Integer.MIN_VALUE;
        if((nums[0]-suffix[0]) <= k) cnt = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max , nums[i]);
            if((max-suffix[i]) <= k ) {
                cnt = i;
                break;
            } 
        }
        return cnt;
    }
}