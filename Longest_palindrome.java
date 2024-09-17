class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] s_arr = s.toCharArray();
        for(int i=0;i<s_arr.length;i++){
            if(!map.containsKey(s_arr[i])){
                map.put(s_arr[i],1);
            }
            else{
                map.put(s_arr[i],map.get(s_arr[i])+1);
            }
        }
        int pal=0;
        int odd_vals=0;
        for(char key : map.keySet()){
            if((map.get(key)%2)==0){
                pal+=map.get(key);
            }
            else{
                pal+=2*(map.get(key)/2);
                odd_vals++;
            }
        }
        if(odd_vals>0) pal+=1;
       
        return pal;
    }
}
