class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String rev = sb.toString();
        
        if(s1.equalsIgnoreCase(rev)){
            return true;
        }
        
        return false;
    }
}