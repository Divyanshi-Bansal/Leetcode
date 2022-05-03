class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        flips = []
        for i in image:
            flips.append(i[::-1])
        length = len(flips)
        for i in range(length):
            for j in range(length):
                if flips[i][j]==0:
                    flips[i][j] = 1
                else:
                    flips[i][j] = 0
        return flips