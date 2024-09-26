//Time Complexity: O(n)
//Space Complexity: O(1)
//Leet Code : Yes

//Use a datastructure such as hashset to reduce the time complexity. 
//Add the values in the set and keep a count. Remove the value if there is a duplicate and increase the count by 2.
//If the final set is not empty - that means there is only odd pairs; so just increase the count by 1



class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null) return -1;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            
            if(!set.contains(c))set.add(c);
            else {
                count+=2;
                set.remove(c);
            }
            
        }
        if(!set.isEmpty())count++;
        return count;
    }
}