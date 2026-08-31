class Solution {
    public int longestConsecutive(int[] nums) {
        int lcs=0;
        int max = 0;
        int startNum=0;
         HashSet <Integer> hashSet = new HashSet();
        for(int i =0 ; i < nums.length ; i++)
        {
            hashSet.add(nums[i]);
        }
        
        for(int l=0 ;  l < nums.length ;l++){
            if(!hashSet.contains(nums[l]-1)){
                lcs=1;
                startNum=nums[l];
            }
            while(hashSet.contains(startNum+1)){
                lcs++;
                max = Math.max(lcs,max);
                startNum++;
            
            }

          
    }
    return Math.max(lcs,max);
    }
}
