class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        map = {}
        for i , num in enumerate(nums):
            if (target - num) in map:
                return [map.get(target-num) , i]
            else:
                map[num] = i
