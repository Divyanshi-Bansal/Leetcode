class Solution:
    def isValid(self, s: str) -> bool:
        brackets = {')':'(','}':'{',']':'['}
        opening = '({['
        closing = ')}]'
        stack = []
        
        for i in s:
            if(i in opening):
                stack.append(i)
            elif(i in closing):
                if (len(stack) == 0):
                    return False
                elif(stack[-1] == brackets[i]):
                    stack.pop()
                else:
                    return False
        return len(stack) == 0
                
        