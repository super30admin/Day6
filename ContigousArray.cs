//Time Complexity: O(n) as we have to iterate through the array
//Space Complexity: O(n)
public class Solution {
     public int FindMaxLength(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return 0;
            }
            Dictionary<int, int> map = new Dictionary<int, int>();
            int cnt = 0; int max = 0;
            int start = -1, end = -1;
            map.Add(0, -1);
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] == 0)
                {
                    cnt = cnt - 1;
                }
                else
                {
                    cnt = cnt + 1;
                }
                if (!map.ContainsKey(cnt))
                {
                    map.Add(cnt, i);
                }
                else
                {
                    if(max < i - map[cnt])
                    {
                        max = i - map[cnt];
                        start = map[cnt];
                        end = i;
                    }
                    
                }
            }
         if(start == -1) start = 0;
         if(max != 0) Console.WriteLine(start +"-" + end);
          return max;
        }
}