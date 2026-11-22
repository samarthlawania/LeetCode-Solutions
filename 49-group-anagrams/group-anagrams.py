class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        groups: dict[str, list[str]] = defaultdict(list)
        for str in strs:
            sorted_str = "".join(sorted(str))
            groups[sorted_str].append(str)
        ans = []
        for items in groups:
            ans.append(groups.get(items))
        return ans
            
        