class Solution {
    public int longestPalindrome(String s) {
        
        int[] char_counts = new int[128];
        for(char c:s.toCharArray()){
            char_counts[c]++;
        }
        int result = 0;
        for(Integer count: char_counts){
                result = result + (count/2)*2;
            if(result%2 == 0 && count%2 == 1)
                result+=1;
        }
        return result;
        
    }
}

//Time Complexity: O(n) Traverse through the whole array to count the occurance of each letter.
