class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i] = true;
        }

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
            for(int j=i*i;j<n;j+=i){
                isPrime[j] = false;
            }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]) count++; 
        }
        return count;
    }
}







    //     int count=0;
    //    // if(n==3) return 1;
    //     for(int i=2;i<n;i++){
    //          int cnt=0;
    //         for(int j=1;j<=i;j++){
    //             if(cnt > 2) break;
    //             if(i%j == 0) cnt++;
    //         }
    //         if(cnt==2) count++;
    //     }
    //     return count;
//     }
// }