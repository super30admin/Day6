//Let there be n words of k length each.
//Time Complexity : O(nklogk) 
//Space Complexity : O(n)
//Code run successfully on LeetCode.

import java.util.HashMap;
import java.util.List;

public class Anagrams_1 {
	
   	public List<List<String>> groupAnagrams(String[] strs) {
   		
	if(strs == null|| strs.length == 0)
		return new ArrayList<>();
	
	HashMap<String, List<String>> map = new HashMap<>();
	
	for(int i =0; i < strs.length; i++) {
		String str1;
		char[] ch = strs[i].toCharArray();
		Arrays.sort(ch);
		str1 = String.valueOf(ch);
		if(!map.containsKey(str1)) {
			map.put(str1, new ArrayList<String>());
		}
		map.get(str1).add(strs[i]);
		
	}

   return new ArrayList<>(map.values());
}

}
