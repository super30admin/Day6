class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        if(s.length()==0|| s==null) return 0;
        int count=0;
        for(char c: s.toCharArray())
        {
            if(set.contains(c))
            {
                set.remove(c);
                count+=2;
            }
            else{
              set.add(c);   
            }
        }
        if(!set.isEmpty()) return count+1;
        else{ return count;}
    }
}