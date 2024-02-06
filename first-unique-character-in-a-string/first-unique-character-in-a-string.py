class Solution:
    def firstUniqChar(self, s: str) -> int:
        for s1 in s:
            if (s.count(s1) == 1):
                return s.index(s1)
        return -1