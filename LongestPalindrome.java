class LongestPalindrome {
    public int longestPalindrome(String str) {
        
        //Time Complexity - o(n) Space Complexity - O(1)
        
        Set<Character> s = new HashSet<Character>();
        int count = 0;
        char[] c = str.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(!s.contains(c[i])){
                s.add(c[i]);
            } else{
                s.remove(c[i]);
                count += 2;
            }
        }
        if(s.size()>=1){
            count = count+1;
        }
        return count;
    }
}