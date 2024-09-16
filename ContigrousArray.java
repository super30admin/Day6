import java.util.HashMap;
import java.util.Map;


//time complexity-o(n)
//space complexity-o(1)
public class ContigrousArray {

	
	public int findMaxLength(int[] nums) {
        int key=0;
	int count=0;
	int count1=0;
	int len=0;
	int ans=Integer.MIN_VALUE;
	Map<Integer,Integer> store=new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]==0)
			count++;
		else
			count1++;
		key=count-count1;
		if(store.containsKey(count))
		{
			len=i-store.get(key);
			ans=Math.max(len, ans);
		}
		else
		{
			store.put(key,i);
		}
		
	}
	return ans;
    }

	public static void main(String args[])
	{
		
	}


}
