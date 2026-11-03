class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;
        int ans=0;
        int maxFreq =0;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
          maxFreq = Math.max(maxFreq, freq[s.charAt(i) - 'A']);
            while(((i-l+1) - maxFreq) > k ){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ans = Math.max(ans , i-l+1);
        }
        return ans;
    }
}
//so our basic idea is to calculate the frequency of each character and then yield the maxfreq character present in the current window , if window length i greater then thr max freq character , we will start removing character from the start point of window (Shrinking of window) and at last , when length of window becomes maxFreq of charcter + k , we will compare and store it in ans 