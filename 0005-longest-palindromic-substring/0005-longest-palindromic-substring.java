class Solution {
    int[][] t = new int[1001][1001];
    public String longestPalindrome(String s) {
        int n= s.length();
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        int maxlen = Integer.MIN_VALUE;
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
        if(ispalindrome(s,i,j) == 1) {
            if((j-i+1) > maxlen) {
                maxlen = j-i+1;
                sp = i;
            } 
        }
            }
        }
        return s.substring(sp , maxlen+sp);
    }
    public int ispalindrome(String s , int i , int j){
        if(i>=j) return 1;
        if(t[i][j] != -1) return t[i][j];

        if(s.charAt(i) == s.charAt(j)) return t[i][j] = ispalindrome(s , i+1 , j-1);

        return t[i][j] = 0;
    }
}