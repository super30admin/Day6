class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i<s.length(); ++i){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        boolean oddConsidered = false;
        int c = 0;
        for(int n : m.values()){
            if(n%2 == 0){
                c += n;
            }else if(!oddConsidered){
                c += n;
                oddConsidered = true;
            } else {
                c += n-1;
            }
                
            }
        return c;
        }
    }
//tc=O(n)
//sc=O(n)
