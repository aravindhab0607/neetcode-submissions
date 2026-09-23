class Solution {
    public void sortColors(int[] nums) {
        int[] bucket = new int[3];
        for(int i = 0; i < nums.length; i++ ){
            bucket[nums[i]] += 1;
        }
        System.out.println(" buck 0 " + bucket[0] + " buck 1 " + bucket[1] + " buck 2 " + bucket[2]);
        int counter = 0;
        for( int n = 0; n < bucket.length; n++){
            for( int j = 0; j < bucket[n] ; j++ ){
               // System.out.println("counter : "+ counter+ "nums" + bucket[n]);
                nums[counter] = n;
                counter += 1;
            }
        }
    }
}