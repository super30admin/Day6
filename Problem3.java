class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> chars = new HashSet<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(chars.contains(c)){
                count += 2;
                chars.remove(c);
            } else{
                chars.add(c);
            }

        }
         if(!chars.isEmpty()){
                    count +=1;
        }

        return count;
    }
}
