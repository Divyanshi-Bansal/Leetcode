class Solution {
    public int countNegatives(int[][] grid) {
        int first = 0;
        int last = grid[0].length;
        int sum =0;
        for(int r =0 ; r< grid.length ; r++){
            sum = sum + index(first , grid[r].length-1 , grid[r]);
        }
        return sum;
    }
    public int index(int f , int l , int[] m){
        int count =  0;
        for(int  c= 0;c<=l;c++){
            if(m[c] <0){count++;}
        }
        return count;
    }
}