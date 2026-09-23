class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
        System.out.print(s);
        int left = 0, right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while( left < right ){
            if( charArray[left] != charArray[right] ){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
