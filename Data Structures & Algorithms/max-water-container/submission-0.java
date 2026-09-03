class Solution {
    public int maxArea(int[] heights) {
        int water = 0;
        int l=0;
       int r= heights.length-1;
       while (l<r){
water = Math.max(water, (r - l) * Math.min(heights[l], heights[r]));        if(heights[l]< heights[r]){
            l++;
        }
        else {
            r--;
        }
       }
       return water;
    }
}
