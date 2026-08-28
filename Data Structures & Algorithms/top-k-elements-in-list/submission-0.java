class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map <Integer,Integer> freqMap = new HashMap();
       for(int i = 0 ; i < nums.length ; i++)
       freqMap.put(nums[i],freqMap.getOrDefault(nums[i], 0) + 1);

       List<Integer> []  buckets = new ArrayList[nums.length+1];
         for (int num : freqMap.keySet()) {

            int frequency = freqMap.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }
         int[] result = new int[k];
        int index = 0;

        for (int frequency = nums.length;
             frequency >= 1 && index < k;
             frequency--) {

            if (buckets[frequency] == null) {
                continue;
            }

            for (int num : buckets[frequency]) {
                result[index++] = num;

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}
