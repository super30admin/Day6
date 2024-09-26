class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        List<Character> list = new ArrayList();
        System.out.println(list);
        for (char i: s.toCharArray()){
            if (list.indexOf(i) == -1) {
                list.add(i);
                 System.out.println(list);
            } else {
                list.remove(list.get(list.indexOf(i)));
                 System.out.println(list);
                result += 2;
            }
        }
        if (result < s.length()) {
            result += 1;
        }
        return result;
    }
}