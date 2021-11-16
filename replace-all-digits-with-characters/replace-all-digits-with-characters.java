class Solution {
    public String replaceDigits(String s) {
        String s1 = "";
        for(int i = 0;i<s.length();i=i+2){
            char ch = s.charAt(i);
            if(i+1 < s.length()){
                char val = s.charAt(i+1);  
                int res = (int) ch+ (int) val-48;
                char newCh = (char) res;
                s1 = s1+Character.toString(ch)+Character.toString(newCh);
            }
            else{
                s1 = s1+Character.toString(ch);
            }
        }
        return s1;
    }
}