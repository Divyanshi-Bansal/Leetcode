class Solution:
    def interpret(self, command: str) -> str:
        ans = command.replace('()' , 'o').replace('(' , '').replace(')' , '')
        return ans
        
        