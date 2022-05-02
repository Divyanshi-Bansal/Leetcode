class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morsecode = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        uniqueCodes = []
        for word in words:
            code = ''
            for i in word:
                code += morsecode[ord(i)-97] 
            uniqueCodes.append(code)
        sets = set(uniqueCodes)
        return len(sets)