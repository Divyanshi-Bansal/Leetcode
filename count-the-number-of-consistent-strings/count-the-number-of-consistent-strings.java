class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        // for(String s: words){
        //     if(s.contains(allowed)){
        //         count++;
        //     }
        //     else if(allowed.contains(s)){
        //         count++;
        //     }
        //     else{
        //         int allowedLength = allowed.length();
        //         int stringLength = s.length();
        //         int x=0;
        //         int index_a=0;
        //         for(int i=0;i<stringLength;i++){
        //             if(allowed.charAt(index_a)==s.charAt(i)){
        //                 index_a++;
        //                 x++;
        //                 if(index_a==allowedLength){
        //                     index_a=0;
        //                 }
        //             }
        //         }
        //         if(x== allowedLength){
        //             count++;
        //         }
        //     }
        // }
        for(int i=0;i<words.length;i++){
            int c = 0;
            for(int j= 0;j<words[i].length();j++){
                if(!allowed.contains(Character.toString(words[i].charAt(j)))){
                    c = 1;
                    break;
                }
            }
            if(c!=1){
                count++;
            }
        }
        return count;
    }
}