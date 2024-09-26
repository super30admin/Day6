    
		// Time Complexity : O(N)
	// Space Complexity : O(N)
	// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this :
	 //NO

class Solution {
    public int longestPalindrome(String s) {
        
        char[] chArray = s.toCharArray();
        HashMap<Character,Integer> map  = new HashMap<>();
        boolean oddCharacters =false;
        int length=0;
        for(int i = 0; i < chArray.length ; i++){
            if(!map.containsKey(chArray[i]))
                map.put(chArray[i],1);
            else
                map.put(chArray[i],map.get(chArray[i])+1);
            
        }
         for (Map.Entry<Character,Integer> entry : map.entrySet()) {
             if(entry.getValue() % 2 == 0)
                 length += entry.getValue();
             else{
                 if(entry.getValue() >2 )
                     length += entry.getValue()-1;
                     oddCharacters = true;
             }
    }
        
        if(oddCharacters ){
            length +=1;
        }
        return length;
    }
}