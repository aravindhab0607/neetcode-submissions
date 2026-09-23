class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i=0; i < nums.length; i++){
            if( ! numMap.containsKey((Integer)nums[i]) ){
                numMap.put(nums[i], 1);
                continue;
            }
            return true;
        }

        return false;
    }
}