class Solution {
    public int longestPalindrome(String s) {
        char[] s1= s.toCharArray();
        HashSet<Character> set= new HashSet<>();
        int result=0;
        for(int i=0;i<s1.length;i++){
            char ch=s1[i];
            if(set.contains(ch)){
                result +=2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }

        }
        if(set.isEmpty()) return result;
        else{
            return result+1;
        }

    }
}
