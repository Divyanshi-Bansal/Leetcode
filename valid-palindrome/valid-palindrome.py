class Solution:
    def isPalindrome(self, s: str) -> bool:
        lowerCaseS = s.lower()
        newS = re.sub("[^a-zA-Z0-9]", "", lowerCaseS)
        # rev = newS[::-1]
        rev = "".join(reversed(newS))
        if(rev==newS):
            return True
        
        return False
        