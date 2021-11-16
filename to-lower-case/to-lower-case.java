class Solution {
    public String toLowerCase(String s) {
        char arr[] = new char[s.length()];
        String result = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i) <='Z'){
                int alpha = (int)s.charAt(i) + 32 ;
                char as = (char) alpha ;
                result = result + Character.toString(as);
            }
            else{
                result = result + s.charAt(i);
            }
        }
        return result;
    }
}