// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class LongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(Character ch : map.keySet()){
            int val = map.get(ch);
            count = count + val/2*2;
            if(count%2==0 && val%2==1)
                count = count + 1;
        }
        
        return count;
    }
}
