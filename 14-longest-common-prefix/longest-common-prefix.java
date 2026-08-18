class Solution {
    public String longestCommonPrefix(String[] strs){
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for (int i=1;i<strs.length;i++){
            int j=0;
            while (j<prefix.length() && j<strs[i].length() && prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            String temp = "";
            for (int k=0;k<j;k++){
                temp += prefix.charAt(k);
            }
            prefix=temp;
            if (prefix.length()==0){
                return "";
            }
        }
        return prefix;
    }
}