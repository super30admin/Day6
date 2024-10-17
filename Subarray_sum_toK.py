class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
      hash_table = {}
      hash_table[0] = 1
      rsum =0
      count= 0
      for i in range(len(nums)):
        rsum = rsum + nums[i]
        if rsum-k in hash_table:
          print(f"called for {rsum}")
          count += hash_table[rsum-k]
        if rsum not in hash_table:
          hash_table[rsum] = 1
        else:
          hash_table[rsum] += 1
      
        

      print(hash_table)
      return count

        