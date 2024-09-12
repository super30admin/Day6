class Solution01 {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> mmap=new HashMap<>();
    int rsum=0;
    int count=0;
    mmap.put(0,1);
        for(int i= 0; i<nums.length; i++){
           rsum+=nums[i];
            if(mmap.containsKey(rsum-k)){
                count+=mmap.get(rsum-k);
            }
            if(!mmap.containsKey(rsum)){
                mmap.put(rsum,1);
            }
            else{
                mmap.put(rsum,mmap.get(rsum)+1);
            }
            
        }
    return count;
    }
}