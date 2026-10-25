class Solution {
    public void reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) return;
        if(n == 1) return;
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums , 0 , n-1);

return;

        //T(c) = O(nk)

    //    int n = nums.length;
    //     k = k%n;
    //     if(nums.length == 1) return;
    //     for(int i=0;i<k;i++){
    //         int x = nums[n-1];
    //         for(int j=n-2;j>=0;j--){
    //             nums[j+1] = nums[j];
    //         }
    //         nums[0] = x;
    //     }
    //     return;



        //T(C) = O(n) and S(C) = O(n)

        //  int n = nums.length;
        // if(k>nums.length){
        //     k = k%n;
        // }
        // int[] arr = new int[nums.length];
        // int j=0;
        // for(int i=n-k;i<nums.length;i++){
        //     arr[j] = nums[i];
        //     j++;
        // }
        // for(int z=0;z<n-k;z++){
        //     arr[j]=nums[z];
        //     j++;
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = arr[i];
        // }
        // return;
}
}