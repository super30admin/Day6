class Solution {
    public int findMaxLength(int[] nums) {
        int c1=0;
        int c0=0;
        int cnt=0;
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(0);
        for(int i=0;i<nums.length;i++)
        {
            c1=0;
            c0=0;
            for(int j=i;j<nums.length;j++){
                
                if(nums[j]==1) c1++;
                if(nums[j]==0) c0++;
                if(c1==c0)
                {
                    cnt=c1+c0;
                    ar.add(cnt);
                }   
            
            }
        }
        return Collections.max(ar);
    }
}
//SC:O(n) extra size for storing count in arrayList ar
//TC:O(n^2)
// bruteforce approach simple traversing of array
//time limit exceeded
