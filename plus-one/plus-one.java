class Solution {
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;
        if(digits[length-1] != 9){//[1,2,3,4,5,....(but not 9 at the last)]
            digits[length-1]++;
            return digits;
        }
        if(length == 1){//[9]
            int[] newArr = {1,0};
            return newArr;
        }
        
        //[1,2,3,2,9,9] or [9,9]
        int temp = 0;
        for(int i = length-1 ; i>=0 ; i--){
            if(digits[i]==9){
                digits[i] = 0;
                temp=1;
            }else{
                digits[i]++;
                temp=0;
                break;
            }
        }
        if(temp == 1){
            int[] newArr = new int[length+1];
            newArr[0] = 1;
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            return newArr;
        }else{
            return digits;
        }
    }
}