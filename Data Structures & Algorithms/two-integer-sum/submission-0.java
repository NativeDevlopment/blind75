class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sumMap = new HashMap();
        int [] indexArray = new int[2];
        for (int i=0 ; i < nums.length ;i++) {

            if(sumMap.containsKey(target-nums[i])){
             indexArray[0]=sumMap.get(target-nums[i]);
                    indexArray[1]=i;
                    return indexArray;}

            sumMap.put(nums[i],i);
        }
return indexArray;
    }
}
