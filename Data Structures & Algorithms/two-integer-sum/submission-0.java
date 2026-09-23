class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for( int i = 0; i < nums.length; i++ ){
            int secondVal = target - nums[i];
            if( map.containsKey( secondVal )){
                output[1] = i;
                output[0] = map.get(secondVal);
                return output;
            }
            map.put( nums[i], i );
        }

        return output;
    }
}
