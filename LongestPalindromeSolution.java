class LongestPalindromeSolution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {// aba
            char c = s.charAt(i);
            if (hs.contains(c)) {// checking if we're getting duplicate char as we need duplicate for a
                                 // palindrone m like a in the above example
                // more than 1
                count = count + 2;// 2 because 1 for add , 1 for remove
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }
        if (!hs.isEmpty()) {
            count = count + 1;
        }
        return count;

    }
}