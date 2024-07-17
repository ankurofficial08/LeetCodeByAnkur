class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i = 0
        while(i < len(nums) and target >= nums[i]):
            if(target == nums[i]):
                return i
            i = i+1
        return i


At line 4 we are giving two condiiton
1. i < len(nums)
2. target >= nums[i]

By first conditionn we are traversing throughout the loop till the length of the loop. so that we can match our target value wheather it is present in list or not.
Now according to question if our target is not present in the list then we have to add it to the list in sorted way and then return the index of that target value , where it is added.
So for that ,
By Second condition we are checking if the target value that is greater than or equal than the index value then we entering inside the loop....
and cheking if the target value is equal to index value then return the index.
or if the value is greater than any of the index then we place the target value just behind the index , where target value is small. and increase the index by +1. and return that index.
