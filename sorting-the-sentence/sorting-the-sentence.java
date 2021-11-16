class Solution {
    public String sortSentence(String s) {
        String s1[] = s.split(" ");
        int l = s1.length;
        String s2[] = new String[l];
        for(String s3 : s1){
            int l1 = s3.length();
            char i = s3.charAt(l1-1);
            int i1 = Character.getNumericValue(i);
            String rem = s3.substring(0,l1-1);
            s2[i1-1] = rem;
        }
        String ans = "";
        for(String d: s2){
            ans = ans + d+" ";
        }
        return ans.strip();
    }
}