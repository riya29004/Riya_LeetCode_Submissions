class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //bucket sort
        
        HashMap<Integer ,Integer> map = new HashMap<>(); // use to store the frequency of each element
        List<Integer>[] bucket = new List[nums.length + 1]; // Array of lists
        //idea is to store on the index which is same as of its frequency. 
        // there can be multiple elements with same frequency that why we use list  
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
          for(int i=bucket.length-1;i>=0;i--){      //iterating the array , from backward to get the max. freq element firstly

            if(bucket[i] != null){
               for(int num : bucket[i]){        //iterating the list inside it. and putting the elements of it in the arr . 
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