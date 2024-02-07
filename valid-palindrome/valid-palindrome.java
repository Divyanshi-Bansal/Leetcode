class Solution {
    public boolean isPalindrome(String s) {
        // String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        String s1 = "";
        for(char c : s.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                s1 += String.valueOf(c);
            }
        }
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String rev = sb.toString();
        
        if(s1.equalsIgnoreCase(rev)){
            return true;
        }
        
        return false;
        
        
    }
}