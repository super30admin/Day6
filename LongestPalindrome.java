class Solution {
    public int longestPalindrome(String s) {
        
        int count =0;
        
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i =0; i < s.length(); i++ ){
            if(hs.contains(s.charAt(i))){
                count++;
                hs.remove(s.charAt(i));
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        
        
        if(!hs.isEmpty()){ // it means here there are atleast one unique element then while rest are partnered because we have added and deleted the elements from set 
            // so we can multiply the count * 2 for all partnered element and add one one for unique element.
            return count*2+1;
        }
        
        return count*2;
        
        // Time Complexity : O(n) Space complexity : O(1)
        
    }
}