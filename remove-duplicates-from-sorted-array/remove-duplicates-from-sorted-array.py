class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # nums = [1,1,2]
        l = len(nums) #3
        temp = list(range(l)) #3
        index = 0
        for i in range(l-1): #0,1
            if(nums[i] != nums[i+1]):
                temp[index] = nums[i] #temp = [1]
                index += 1 #1
        
        temp[index] = nums[l-1] #temp = [1,2]
        index += 1  #2
        
        # nums[:len(temp)] = temp[:len(temp)]
        for i in range(len(temp)):
            nums[i] = temp[i]
        return index
        
        
            
                
        