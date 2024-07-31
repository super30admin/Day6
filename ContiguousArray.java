// works with the idea that {0,1}, where the key = sum , value = index.
// and also x+y = k. so if we know x, y = sum-x; so search for sum-x.
// time complexity = O(n)
// space complexity = O(n)
// A running sum problem.
import java.util.HashMap;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        // map is {sum: index}
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);// index -1(a dummy index) is gonna have the sum as 0.
        // this is done to free up the dependency of index 0 (actual 0 index.)
        // otherwise we are stuck on index 0.
        int sum=0;
        int ans=0;
        for(int i=0;i< nums.length;i++) {
            if(nums[i] == 0 ) {
                sum-=1;
            } else {
                sum+=1;
            }
            if(map.containsKey(sum)) {// why we do this- simply put
                // if we already have sum as -2, then if we get -2 again , the sequence between them will have 0 as sum, that's how they can maintain -2 as sum.
                // eg  [0,0,1,0,0,0,1,1]- expected is 6.
                
                // this allows that we account for z = x-y (we are getting z by doing i- map.get(sum))
                ans = Math.max(ans,i- map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}