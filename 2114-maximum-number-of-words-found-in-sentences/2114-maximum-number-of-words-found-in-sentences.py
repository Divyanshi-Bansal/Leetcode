class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        maxL = 0
        for sentence in sentences:
            sentenceLenth = len(sentence.split(" "))
            if maxL < sentenceLenth:
                maxL = sentenceLenth
        return maxL 