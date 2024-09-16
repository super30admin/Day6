// Time Complexity : O(N) where N is the number of elements in the map
// Space Complexity : O(N) where N is the number of unique characters in the string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I missed to consider the edge case 'a = 3' then we add 3 if flag is false else add 2.

class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        boolean single = false;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);
        for(char c: map.keySet()){
            int val = map.get(c);
          //odd numbers
            if( val%2 == 1){
              //edge case 'a = 3' then we add 3 if flag is false
                if(val >= 1  && single == false){
                    single = true;
                    count += val;
                }   
              //else add 2
                else if(val > 1  && single == true)
                    count += (val - 1);
            }
            //even numbers
            if(val%2==0){
                count += val;
            }
        }
        return count;
    }
}
