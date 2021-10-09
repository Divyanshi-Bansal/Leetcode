import java.util.*;
class Solution {
    public int minTimeToType(String word) {
        int count = word.length();
        char present  = 'a';
        for(int i=0 ; i<word.length() ; i++){
            int index = Math.abs(word.charAt(i) - present);
            if(index > 13){
                index = 26-index;
            }
            count = count + index;
            present = word.charAt(i);
        }
        return count;
    }
}