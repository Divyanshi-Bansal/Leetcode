class Solution {
    public boolean isAnagram(String s, String t) {
        
        int ls = s.length();
        int lt = t.length();
        
        if(ls != lt){
            return false;
        }
        
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        String newS = new String(cs);
        String newT = new String(ct);
        
        if(newS.equals(newT)){
            return true;
        }
        
        return false;
        
    }
}
