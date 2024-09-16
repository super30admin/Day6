// Time Complexity :O(n)
// Space Complexity :O(26)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//we count the number of even occourences and then multiply by 2;then add one if singular elemnts remain in the Hashset that were not removed before
public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}
--------------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution{
	public int findMaxLength(int[] nums)
	{
		if(nums[]==null||nums.length==0)//Edge case
		{
			return 0;
		}
		HashMap<Integer,Integer> hm = new HashMap();
		int rsum=0;
		hm.put(0,-1);//Initially inserting 0 to take care of the situation where balanced occourences are in earl mart of the array
		int max=0;
		for( int i=0;i<nums.length;i++)
		{
			rsum=nums[i]==0?rsum-1:rsum+1;
			if(!map.containsKey(rsum)){
			map.put(rsum,i);
			}
			else
			{
				max=Math.max(max,i-map.get(rsum));//Update the value of that rsum with current index to indicate that now anothe balanced occourence has taken place at this index
			}
			
		}
		return max;
		
	}
}

--------------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return 0;
        int rsum=0;
        int count=0;
        HashMap<Integer,Integer> hm= new HashMap();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            rsum+=nums[i];
            int compliment=rsum-k;
            if(hm.containsKey(compliment))
                count+=hm.get(compliment);
        
        if(!hm.containsKey(rsum)){
            hm.put(rsum,1);
        }
        else
        {
            hm.put(rsum,hm.get(rsum)+1);
        } 
        }
        return count;     
    
}
}