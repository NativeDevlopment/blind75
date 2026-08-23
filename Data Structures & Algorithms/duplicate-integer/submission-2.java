class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashMap<Integer,Integer> duplicateMap = new HashMap();
    int count=0;
    for (int i =0 ; i< nums.length ; i++)
    {
        if(duplicateMap.containsKey(nums[i])){
                return true;
        }
        duplicateMap.put(nums[i],nums[i]);
       
        
    }
    return false;
    }
}