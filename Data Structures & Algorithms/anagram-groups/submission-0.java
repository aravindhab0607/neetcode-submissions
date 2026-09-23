class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> resultMap = new HashMap<String, List<String>>();
         for( String s : strs ){
            int[] count = new int[26];
            for( char c : s.toCharArray() ){
                count[ c - 'a' ]++;
            }
            String key = Arrays.toString(count);
            resultMap.putIfAbsent(key, new ArrayList<String>());
            resultMap.get(key).add(s);
         }

         return new ArrayList( resultMap.values() );
    }
}
