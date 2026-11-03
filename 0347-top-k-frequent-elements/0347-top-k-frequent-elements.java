class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //bucket sort
        
        HashMap<Integer ,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int n:nums){
            map.put(n , map.getOrDefault(n,0)+1);
        }
        
        for (int key : map.keySet()) {
          int freq = map.get(key);

         if (bucket[freq] == null) {
        bucket[freq] = new ArrayList<>();
         }
          bucket[freq].add(key);
        
        }


      int[] arr = new int[k];
        int x=0;
          for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i] != null){
               for(int num : bucket[i]){
                if(k==0) break;
                arr[x] = num;
                x++;
                k--;
               }
            }
          }
          return arr;
      }
}