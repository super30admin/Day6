class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int size=0;
        
        for(int x = 0; x< s.length (); x++){
            char ch = s.charAt(x);
            
            if(hashSet.contains(ch)){
                size +=2;
                hashSet.remove(ch);
                
            }else{hashSet.add(ch);}
            }
        
        if(hashSet.isEmpty())
            return size;
        return size + 1;
        }
}

//tc:O(n)
//sc:O(1)