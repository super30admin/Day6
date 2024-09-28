class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        // Traversing the String

        for(int i=0; i<s.length(); i++){
            Character current = s.charAt(i);
            // Check if character is present
            if(!set.contains(current)){
                set.add(current);
            }
            else{
                set.remove(current);
                count+=2;
            }
        }
        if(!set.isEmpty()){
            count+=1;
        }
        else{
            return count;
        }
        return count;
    }
}