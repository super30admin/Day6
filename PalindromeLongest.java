class Solution {
    public int longestPalindrome(String s) {
         HashMap<Character, Integer> map= new HashMap<>();
        for (int i =0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }
        int result =0;int extra=0;
        for (Map.Entry mapElement : map.entrySet()) {
            Character key = (Character)mapElement.getKey();
            int value = ((int)mapElement.getValue());
   
           if(value %2==0) result+=value;
           else if(value>1) {
               result+=value-1;
               extra+=1;
           }
            else extra+=1;
        }
        if(extra>0) return result+1;
        else return result;
    }
}