class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = [[1 for j in range(i)] for i in range(1,numRows+1)]
        
        if numRows == 1:
            return triangle
        
        if numRows == 2:
            return triangle
        
        for i in range(2,numRows):
            index = 0
            for j in range(1,i):
                triangle[i][j] = triangle[i-1][index] + triangle[i-1][index+1]
                index += 1
        
        return triangle
                