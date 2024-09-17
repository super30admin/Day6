//TC : O(n)
//SC : O(1)
//runs in leetcode
class LongestPalindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        //hashmap char,count
        //sum all even + all odds (odd-1) + one odd
        //palindrome will have all even char and one odd at center.
        int count =0;
        boolean oddFlag = false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int cnt = map.getOrDefault(ch,0) + 1;
            map.put(ch, cnt);
        }
        for(int value: map.values()){
            if(value%2==0){
                count+=value;
            }else{
                oddFlag = true;
                count+=value-1;

            }
            System.out.println(value);
        }

        if(oddFlag) count+=1;
        return count;
    }

    public static final void main(String [] args){
        String s = "abccccdd";
        System.out.println("output:: " + longestPalindrome(s));

        s = "abccccddbb";
        System.out.println("output:: " + longestPalindrome(s));

    }
}
