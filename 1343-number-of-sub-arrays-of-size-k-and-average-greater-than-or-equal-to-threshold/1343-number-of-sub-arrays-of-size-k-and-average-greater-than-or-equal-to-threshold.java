class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        double sum=0;
        int count=0;
        while(i<k){
            sum += arr[i];
            i++;
        }
        double avg = sum/k;
        if(avg >= threshold) count++;
        int l=0;
        while(i<arr.length){
            sum += arr[i] - arr[l];
            avg = sum/k;
            if(avg >= threshold){
                System.out.println(count);
                count++;
            } 
            i++;
            l++;
        }
        return count;
    }
}