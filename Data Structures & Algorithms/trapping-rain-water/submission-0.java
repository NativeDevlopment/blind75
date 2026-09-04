class Solution {
    public int trap(int[] height) {
        int prefix=0;
        int prefixArray [] = new int [height.length];
        int suffix=0;
        int suffixArray [] = new int [height.length];
        int trapwater= 0;
        for(int i =0 ; i < height.length;i++){
        prefix= Math.max (height[i],prefix);
        prefixArray[i]=prefix;
        }
         for(int i =height.length -1 ; i >= 0 ;i--){
       suffix = Math.max(height[i], suffix);
suffixArray[i] = suffix;
        }
         for(int i =0 ; i < height.length  ;i++){
                   trapwater += Math.min(prefixArray[i], suffixArray[i]) - height[i];

        
        }
return trapwater;
    }
}
