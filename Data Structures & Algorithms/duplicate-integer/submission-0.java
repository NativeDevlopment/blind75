class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count =0;
        Map<Integer,Integer> constraints= new HashMap<Integer,Integer>();
        while(count< nums.length){
            if(constraints.containsKey(nums[count])){
                return true;
            }
          constraints.put(nums[count],nums[count]);

            count++;
        }
    return false;
    }
}
