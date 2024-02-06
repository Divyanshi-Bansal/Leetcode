class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if(len(s) != len(t)):
            return False
        
        d = dict();
        for s1 in s:
            d[s1] = s.count(s1)
        
        for t1 in t:
            if d.get(t1) == None:
                return False
            elif d.get(t1) != t.count(t1):
                return False
        return True