class Solution {
    public int longestPalindrome(String st) {
        HashMap<Character,Integer> map=new HashMap<>();
       char[] s = st.toCharArray();
        for(int i=0;i<s.length;i++){
           map.put(s[i], map.getOrDefault(s[i],0)+1);
           
        }
       
         int c=0;  
         int flag=0;
          for(int i=0;i<s.length;i++){
            if (map.get(s[i])>0){
              if(map.get(s[i])>=2){
                 map.put(s[i],map.get(s[i])-2); 
                 c=c+2;
              } else
               flag=1;
            }
          }
          
          if(flag==0)
           return c;
           else
           return c+1;
    }
}