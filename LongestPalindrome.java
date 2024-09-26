import java.util.*;

class LongestPalindrome {
    public static int count(String s){
      int count =s.length();
      HashMap<Character, Integer> map = new HashMap<>();
      char[] arr = s.toCharArray();
      boolean odd = false;
      for(char x : arr){
          if(map.containsKey(x)){
              map.put(x,map.get(x)+1);
          }else{
              map.put(x,1);
          }
      }
      for(HashMap.Entry<Character,Integer> entry :map.entrySet()){
          if(entry.getValue()%2!=0){
              count--;
              odd=true;
          }
      }
        
        return odd ? count+1:count;
    }
  
	public static void main (String[] args) {
	
		System.out.println(count("abccccdd"));
		
	}
}