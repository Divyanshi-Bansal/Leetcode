class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        len_r = len(mat)
        len_c = len(mat[0])
        
        element_mat = len_r * len_c
        element_target = r*c
        
        if element_mat != element_target:
            return mat
        
        elements = []
        
        for row in range(len_r):
            for col in range(len_c):
                elements.append(mat[row][col])
                
        index = 0
        target = [[0 for j in range(c)] for i in range(r)]
        
        for row in range(r):
            for col in range(c):
                target[row][col] = elements[index]
                index += 1
        
        return target