//Time Complexity is O(1) --> because we are traversing using for loop
//Space Complexity is O(1) --> O(26) is also a constant


class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)){    //here "search" operation is O(1)
                count = count + 2;
                set.remove(c);      // here "remove" operation is O(1)
            }else 
                set.add(c);
        }
        
        if(!set.isEmpty()) count++;  //here "isEmpty" operation is o(1)
        return count;
        
    }
}
