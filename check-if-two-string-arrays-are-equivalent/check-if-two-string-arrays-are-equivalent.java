class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(String s: word1){
            s1 = s1+s;
        }
        for(String sw: word2){
            s2 = s2+sw;
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}