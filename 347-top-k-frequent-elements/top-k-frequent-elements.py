class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        count_dict = {}
        for num in nums:
            count_dict[num] = count_dict.get(num,0) + 1;                
        sorted_nums = sorted(count_dict.keys(), key=count_dict.get, reverse=True)
        return sorted_nums[0:k:]