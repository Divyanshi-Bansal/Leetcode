class Solution {
    public void reverseString(char[] s) {
        //divyanshi 
        //ihsn a yvid
        
        int l = s.length;
        int index = l-1;
        int loopTime = l/2;
        for(int i=0;i<loopTime;i++ ){
            char originalElement = s[i];
            s[i] = s[index];
            s[index] = originalElement;
            index--;
        }
    }
}