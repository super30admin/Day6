class Solution {
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        int r=0;
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character c:hm.keySet()){
            int k=hm.get(c);
            if(k%2==0){
                r+=k;
            }
            else{
                r+=k-1;
                hm.put(c,1);
            }
        }
        if(hm.containsValue(1)){
            r++;
        }
        return r;
    }
}
