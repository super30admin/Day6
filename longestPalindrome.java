//tc O(n)
//sc O(n)


class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0; i<s.length();i++){
            if(hashSet.contains(s.charAt(i))){
               length = length + 2;
                hashSet.remove(s.charAt(i));
            }
            else{               
            
                hashSet.add(s.charAt(i));
            
            }
            
            
        }
        if(!hashSet.isEmpty())
                length+=1;
        return length;
    }
}