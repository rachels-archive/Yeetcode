from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count = Counter(nums)
        count = sorted(count.items(), key=lambda x:x[1])
        count = [x[0] for x in count]
        res = count[-k:]
        return res[::-1]
