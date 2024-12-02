def findMaxLength(nums: List[int]):
		res=0
		hashMap={0:-1}
		count=0
		length=0
		for i in range(len(nums)):
			if nums[i]==0:
				count+=1
			if nums[i]==1:
				count-=1
			if count in hashMap:
				length=i-hashMap[count]
			if count not in hashMap:
				hashMap[count]=i            
			res=max(res,length)
		return res
#Time complexity==O(N)
#Space Complexity==O(N)