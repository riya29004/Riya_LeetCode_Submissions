class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int maxA =0;
        while(i<j){
            int h1 = height[i];
            int h2 = height[j];
            int h = Math.min(h1,h2);
            int w = j-i;
            int Area = h*w;
            maxA = Math.max(Area , maxA);
            if(h1>=h2) j--;
            if(h1<h2) i++;
    }

    return maxA;
}
}