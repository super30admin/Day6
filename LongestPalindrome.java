class LongestPalindrome {
    public int longestPalindrome(String s) {

        int odd = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // check for odd occurances
        for(Object value : map.values()){
            if((int)value % 2 !=0)
                odd++;
        }
        return odd > 0? n - odd + 1 : n;

    }
}